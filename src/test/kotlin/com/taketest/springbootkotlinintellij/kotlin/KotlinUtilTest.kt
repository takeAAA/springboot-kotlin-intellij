package com.taketest.springbootkotlinintellij.kotlin

import org.assertj.core.api.Assertions
import org.junit.Test

class KotlinUtilTest {
    @Test
    fun sampleIfTest1() {
        val kotlinUtil = KotlinUtil()
        Assertions.assertThat(kotlinUtil.sampleIf(null)).isEqualTo("空です")
    }
    @Test
    fun sampleIfTest2() {
        val kotlinUtil = KotlinUtil()
        Assertions.assertThat(kotlinUtil.sampleIf("test")).isEqualTo("空ではありません")
    }
    @Test
    fun sampleSwitchTest1() {
        val kotlinUtil = KotlinUtil()
        Assertions.assertThat(kotlinUtil.sampleSwitch(1)).isEqualTo("1です")
    }
    @Test
    fun sampleSwitchTest2() {
        val kotlinUtil = KotlinUtil()
        Assertions.assertThat(kotlinUtil.sampleSwitch(2)).isEqualTo("2です")
    }
    @Test
    fun sampleSwitchTest3() {
        val kotlinUtil = KotlinUtil()
        Assertions.assertThat(kotlinUtil.sampleSwitch(3)).isEqualTo("1と2以外です")
    }
    @Test
    fun sampleForTest1() {
        val kotlinUtil = KotlinUtil()
        Assertions.assertThat(kotlinUtil.sampleFor(listOf(false, true))).isEqualTo("trueがありました");
    }
    @Test
    fun sampleForTest2() {
        val kotlinUtil = KotlinUtil()
        Assertions.assertThat(kotlinUtil.sampleFor(listOf(false, false))).isEqualTo("全てfalseでした");
    }
    @Test
    fun sampleErrorTest1() {
        val kotlinUtil = KotlinUtil()
        Assertions.assertThat(kotlinUtil.sampleError("1")).isEqualTo("数字でした")
    }
    @Test
    fun sampleErrorTest2() {
        val kotlinUtil = KotlinUtil()
        Assertions.assertThat(kotlinUtil.sampleError("a")).isEqualTo("数字以外でした")
    }
}

