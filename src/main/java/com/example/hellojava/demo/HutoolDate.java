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

        // 时间日期转字符串
        String formatDate = DateUtil.formatDate(date);
        String formatDateTime = DateUtil.formatDateTime(date);
        System.out.println(formatDate);
        System.out.println(formatDateTime);
    }
}
