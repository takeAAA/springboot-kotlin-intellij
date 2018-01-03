package com.taketest.springbootkotlinintellij.kotlin

import org.assertj.core.api.Assertions
import org.junit.Test

class KotlinUtilTest {
    @Test
    fun sampleIfTest1() {
        Assertions.assertThat(KotlinUtil.sampleIf(null)).isEqualTo("空です")
    }
    @Test
    fun sampleIfTest2() {
        Assertions.assertThat(KotlinUtil.sampleIf("test")).isEqualTo("空ではありません")
    }
    @Test
    fun sampleSwitchTest1() {
        Assertions.assertThat(KotlinUtil.sampleSwitch(1)).isEqualTo("1です")
    }
    @Test
    fun sampleSwitchTest2() {
        Assertions.assertThat(KotlinUtil.sampleSwitch(2)).isEqualTo("2です")
    }
    @Test
    fun sampleSwitchTest3() {
        Assertions.assertThat(KotlinUtil.sampleSwitch(3)).isEqualTo("1と2以外です")
    }
    @Test
    fun sampleForTest1() {
        Assertions.assertThat(KotlinUtil.sampleFor(listOf(false, true))).isEqualTo("trueがありました")
    }
    @Test
    fun sampleForTest2() {
        Assertions.assertThat(KotlinUtil.sampleFor(listOf(false, false))).isEqualTo("全てfalseでした")
    }
    @Test
    fun sampleErrorTest1() {
        Assertions.assertThat(KotlinUtil.sampleError("1")).isEqualTo("数字でした")
    }
    @Test
    fun sampleErrorTest2() {
        Assertions.assertThat(KotlinUtil.sampleError("a")).isEqualTo("数字以外でした")
    }
    @Test
    fun sampleMapTest1() {
        Assertions.assertThat(KotlinUtil.sampleMap(mapOf(1 to "test", 2 to "Map"))).isEqualTo("testがありました")
    }
    @Test
    fun sampleMapTest2() {
        Assertions.assertThat(KotlinUtil.sampleMap(mapOf(1 to "Map", 2 to "Map"))).isEqualTo("testがありません")
    }
    @Test
    fun sampleVariableLength() {
        Assertions.assertThat(KotlinUtil.sampleVariableLength(1,2,3)).isEqualTo(6)
    }
}
