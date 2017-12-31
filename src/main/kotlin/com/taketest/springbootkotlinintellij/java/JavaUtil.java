package com.taketest.springbootkotlinintellij.java;

import java.util.List;

public class JavaUtil {
    public String sampleIf(String arg) {
        return arg == null || arg.isEmpty() ? "空です" : "空ではありません";
    }
    public String sampleSwitch(int arg) {
        switch (arg) {
            case 1:
               return "1です";
            case 2:
                return "2です";
            default:
                return "1と2以外です";
        }
    }
    public String sampleFor(List<Boolean> args) {
        for (Boolean arg : args) {
            if (arg) {
                return "trueがありました";
            }
        }
        return "全てfalseでした";
    }
    public String sampleError(String arg) {
        try {
            Integer.parseInt(arg);
            return "数字でした";
        }
        catch (NumberFormatException e) {
            return "数字以外でした";
        }
    }
}
