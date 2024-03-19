package com.example.hellojava.demo;

import cn.hutool.core.date.DateTime;
import cn.hutool.core.date.DateUtil;

class HutoolDate {
    public static void main(String[] args) {
        // Now
        DateTime date = DateUtil.date();
        String now = DateUtil.now();
        String today = DateUtil.today();
        System.out.println(date);
        System.out.println(now);
        System.out.println(today);

        // 2017-03-01
        String formatDate = DateUtil.formatDate(date);
        System.out.println(formatDate);

        // 2017-03-01 00:00:00
        String formatDateTime = DateUtil.formatDateTime(date);
        System.out.println(formatDateTime);

        // 00:00:00
        String formatTime = DateUtil.formatTime(date);
        System.out.println(formatTime);

        // Custom format
        String customFormat = DateUtil.format(date, "yyyyMMddHHmmss");
        System.out.println(customFormat);

        // Date string to DateTime
        DateTime currentDateTime = DateUtil.parse(now);
        DateTime parsedDate = DateUtil.parse(now, "yyyy-MM-dd");
        System.out.println(currentDateTime);
        System.out.println(parsedDate);

        // year/month
        int year = DateUtil.year(date);
        int month = DateUtil.month(date);
        System.out.println(year);
        System.out.println(month);

        // 开始结束时间
        DateTime beginOfDay = DateUtil.beginOfDay(date);
        DateTime endOfDay = DateUtil.endOfDay(date);
        System.out.println(beginOfDay);
        System.out.println(endOfDay);

        // 日期时间偏移
        DateTime offsetDay = DateUtil.offsetDay(date, 3);
        DateTime offsetDay1 = DateUtil.offsetDay(date, -3);
        DateUtil.yesterday();
        DateUtil.tomorrow();
        DateUtil.lastMonth();
        DateUtil.nextMonth();
        System.out.println(offsetDay);
        System.out.println(offsetDay1);

        // 日期时间差
        // 是否闰年
        // 年龄
    }
}
