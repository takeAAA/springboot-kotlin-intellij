package com.taketest.springbootkotlinintellij.kotlin



class KotlinUtil {
    companion object {
        fun sampleIf(arg: String?): String = if (arg == null || arg.isEmpty()) "空です" else "空ではありません"
        fun sampleSwitch(arg: Int): String {
            when (arg) {
                1 -> return "1です"
                2 -> return "2です"
                else -> return "1と2以外です"
            }
        }

        fun sampleFor(args: List<Boolean>): String {
            for (arg in args) {
                if (arg) {
                    return "trueがありました"
                }
            }
            return "全てfalseでした"
        }

        fun sampleError(arg: String): String {
            try {
                Integer.parseInt(arg)
                return "数字でした"
            } catch (e: NumberFormatException) {
                return "数字以外でした"
            }
        }

        fun sampleMap(arg: Map<Int, String>) = if (arg.containsValue("test")) "testがありました" else "testがありません"
        fun sampleVariableLength(vararg args: Int) = args.sum()
    }
}