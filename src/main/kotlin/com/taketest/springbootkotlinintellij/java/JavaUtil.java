package com.taketest.springbootkotlinintellij.java;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

public class JavaUtil {
    public static String sampleIf(String arg) {
        return arg == null || arg.isEmpty() ? "空です" : "空ではありません";
    }
    public static String sampleSwitch(int arg) {
        switch (arg) {
            case 1:
               return "1です";
            case 2:
                return "2です";
            default:
                return "1と2以外です";
        }
    }
    public static String sampleFor(List<Boolean> args) {
        for (Boolean arg : args) {
            if (arg) {
                return "trueがありました";
            }
        }
        return "全てfalseでした";
    }
    public static String sampleError(String arg) {
        try {
            Integer.parseInt(arg);
            return "数字でした";
        }
        catch (NumberFormatException e) {
            return "数字以外でした";
        }
    }
    public static String sampleMap(Map<Integer, String> arg) {
        return arg.containsValue("test") ? "testがありました" : "testがありません";
    }
    public static int sampleVariableLength(int... args) {
        return Arrays.stream(args).sum();
    }
}
