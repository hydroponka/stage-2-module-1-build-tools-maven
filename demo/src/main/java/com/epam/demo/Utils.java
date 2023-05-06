package com.epam.demo;

import com.epam.utils.StringUtils;

import java.util.List;

public class Utils {
    public static boolean isAllPositiveNumbers(List<String> args) {
        int count = 0;
       for (String arg : args){
           if (StringUtils.isPositiveNumber(arg)){
               count +=1;
           }
       }
       return count == args.size();
    }
}