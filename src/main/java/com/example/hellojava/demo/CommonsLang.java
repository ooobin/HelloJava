package com.example.hellojava.demo;

import org.apache.commons.lang3.ArrayUtils;
import org.apache.commons.lang3.ObjectUtils;
import org.apache.commons.lang3.RandomStringUtils;
import org.apache.commons.lang3.StringUtils;
import org.apache.commons.lang3.time.DateFormatUtils;
import org.apache.commons.lang3.time.DateUtils;

import java.text.ParseException;
import java.util.Date;

public class CommonsLang {

    public static void main(String[] args) throws ParseException {
        // StringUtils
        StringUtils.isEmpty(null);      // true
        StringUtils.isEmpty("");        // true
        StringUtils.isNotEmpty("abc");  // true

        StringUtils.isBlank(null);      // true
        StringUtils.isBlank("");        // true
        StringUtils.isBlank(" ");       // true
        StringUtils.isNotBlank("abc");  // true

        String[] array = {"a", "b", "c"};
        String joined = StringUtils.join(array, ", ");  // "a, b, c"

        String str = "a,b,c";
        String[] split = StringUtils.split(str, ',');  // ["a", "b", "c"]


        // ArrayUtils
        int[] array1 = {};
        boolean isEmpty = ArrayUtils.isEmpty(array1);  // true


        // ObjectUtils
        String str1 = null;
        String defaultStr = ObjectUtils.defaultIfNull(str1, "default");  // "default"


        // RandomStringUtils
        String randomStr1 = RandomStringUtils.randomAlphabetic(10);  // 生成10个随机字母
        String randomStr2 = RandomStringUtils.randomAlphanumeric(10);  // 生成10个随机字母数字


        // DateUtils
        String stringDate = "2024-05-28 15:30:00";
        Date date = DateUtils.parseDate(stringDate, "yyyy-MM-dd HH:mm:ss");
        String formattedDateTime = DateFormatUtils.format(date, "yyyy-MM-dd HH:mm:ss");

    }
}
