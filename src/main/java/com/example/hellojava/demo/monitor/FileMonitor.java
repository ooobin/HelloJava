package com.example.hellojava.demo.monitor;

import org.apache.commons.io.monitor.FileAlterationMonitor;
import org.apache.commons.io.monitor.FileAlterationObserver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import java.io.File;

@Component
public class FileMonitor implements ApplicationRunner {

    private static final String DIRECTORY_TO_MONITOR = "/path/to/directory";

    private final FileChangeListener fileChangeListener;

    @Autowired
    public FileMonitor(FileChangeListener fileChangeListener) {
        this.fileChangeListener = fileChangeListener;
    }

    @Override
    public void run(ApplicationArguments args) throws Exception {
        File directory = new File(DIRECTORY_TO_MONITOR);

        // 创建文件变化监听器
        FileAlterationObserver observer = new FileAlterationObserver(directory);
        observer.addListener(fileChangeListener);

        // 设置监听频率，单位ms
        long interval = 5000;
        FileAlterationMonitor monitor = new FileAlterationMonitor(interval);
        monitor.addObserver(observer);

        // 启动文件变化监听器
        monitor.start();
    }
}

