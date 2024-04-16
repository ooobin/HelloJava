package com.example.hellojava.schedule;

import jakarta.annotation.PostConstruct;
import lombok.extern.slf4j.Slf4j;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Slf4j
@Component
//@EnableScheduling
public class TestSchedule {

    @PostConstruct
    public void init() {
        // 这里写你需要在系统启动时执行一次的代码
        System.out.println("系统启动，执行一次的任务");
    }

    /**
     * 秒 分 时 日 月 周
     * (',' 枚举)  ('-' 区间)  ('/' 步长)  ('W' 工作日)
     * 由于"月份中的日期"和"星期中的日期"这两个元素互斥的, 必须要对其中一个设置 ?
     */
    @Scheduled(cron = "0/5 * * * * ?")
    public void test() {
        log.info("定时任务1");
    }

    /**
     * 启动后延迟两秒启动定时器, 之后每隔 30s 执行一次
     */
    @Scheduled(initialDelay = 1000 * 2, fixedRate = 1000 * 30)
    public void testAsync() {
        log.info("定时任务2");
    }

}
