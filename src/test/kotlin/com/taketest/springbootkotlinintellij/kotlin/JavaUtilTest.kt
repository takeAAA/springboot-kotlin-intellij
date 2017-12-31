package com.taketest.springbootkotlinintellij.kotlin

import com.taketest.springbootkotlinintellij.java.JavaUtil
import org.assertj.core.api.Assertions
import org.junit.Test

class JavaUtilTest {
    @Test
    fun sampleIfTest1() {
        val javaUtil = JavaUtil()
        Assertions.assertThat(javaUtil.sampleIf(null)).isEqualTo("空です")
    }
    @Test
    fun sampleIfTest2() {
        val javaUtil = JavaUtil()
        Assertions.assertThat(javaUtil.sampleIf("test")).isEqualTo("空ではありません")
    }
    @Test
    fun sampleSwitchTest1() {
        val javaUtil = JavaUtil()
        Assertions.assertThat(javaUtil.sampleSwitch(1)).isEqualTo("1です")
    }
    @Test
    fun sampleSwitchTest2() {
        val javaUtil = JavaUtil()
        Assertions.assertThat(javaUtil.sampleSwitch(2)).isEqualTo("2です")
    }
    @Test
    fun sampleSwitchTest3() {
        val javaUtil = JavaUtil()
        Assertions.assertThat(javaUtil.sampleSwitch(3)).isEqualTo("1と2以外です")
    }
    @Test
    fun sampleForTest1() {
        val javaUtil = JavaUtil()
        Assertions.assertThat(javaUtil.sampleFor(listOf(false, true))).isEqualTo("trueがありました");
    }
    @Test
    fun sampleForTest2() {
        val javaUtil = JavaUtil()
        Assertions.assertThat(javaUtil.sampleFor(listOf(false, false))).isEqualTo("全てfalseでした");
    }
    @Test
    fun sampleErrorTest1() {
        val javaUtil = JavaUtil()
        Assertions.assertThat(javaUtil.sampleError("1")).isEqualTo("数字でした")
    }
    @Test
    fun sampleErrorTest2() {
        val javaUtil = JavaUtil()
        Assertions.assertThat(javaUtil.sampleError("a")).isEqualTo("数字以外でした")
    }
}

