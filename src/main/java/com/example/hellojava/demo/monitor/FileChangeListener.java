package com.example.hellojava.demo.monitor;

import org.apache.commons.io.monitor.FileAlterationListener;
import org.apache.commons.io.monitor.FileAlterationObserver;
import org.springframework.stereotype.Service;

import java.io.File;

@Service
public class FileChangeListener implements FileAlterationListener {

    @Override
    public void onStart(final FileAlterationObserver observer) {
        // 当监听器开始监听时触发的操作
        System.out.println("File monitoring started for " + observer.getDirectory());
    }

    @Override
    public void onDirectoryCreate(final File directory) {
        // 当目录被创建时触发的操作
        System.out.println("Directory created: " + directory.getName());
    }

    @Override
    public void onDirectoryChange(final File directory) {
        // 当目录被修改时触发的操作
        System.out.println("Directory changed: " + directory.getName());
    }

    @Override
    public void onDirectoryDelete(final File directory) {
        // 当目录被删除时触发的操作
        System.out.println("Directory deleted: " + directory.getName());
    }

    @Override
    public void onFileCreate(final File file) {
        // 当文件被创建时触发的操作
        System.out.println("File created: " + file.getName());
    }

    @Override
    public void onFileChange(final File file) {
        // 当文件被修改时触发的操作
        System.out.println("File changed: " + file.getName());
    }

    @Override
    public void onFileDelete(final File file) {
        // 当文件被删除时触发的操作
        System.out.println("File deleted: " + file.getName());
    }

    @Override
    public void onStop(final FileAlterationObserver observer) {
        // 当监听器停止监听时触发的操作
        System.out.println("File monitoring stopped for " + observer.getDirectory());
    }
}

