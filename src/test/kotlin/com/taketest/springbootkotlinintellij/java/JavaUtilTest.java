package com.taketest.springbootkotlinintellij.java;

import org.assertj.core.api.Assertions;
import org.junit.Test;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class JavaUtilTest {
    @Test
    public void sampleIfTest1() {
        Assertions.assertThat(JavaUtil.sampleIf(null)).isEqualTo("空です");
    }
    @Test
    public void sampleIfTest2() {
        Assertions.assertThat(JavaUtil.sampleIf("test")).isEqualTo("空ではありません");
    }
    @Test
    public void sampleSwitchTest1() {
        Assertions.assertThat(JavaUtil.sampleSwitch(1)).isEqualTo("1です");
    }
    @Test
    public void sampleSwitchTest2() {
        Assertions.assertThat(JavaUtil.sampleSwitch(2)).isEqualTo("2です");
    }
    @Test
    public void sampleSwitchTest3() {
        Assertions.assertThat(JavaUtil.sampleSwitch(3)).isEqualTo("1と2以外です");
    }
    @Test
    public void sampleForTest1() {
        Assertions.assertThat(JavaUtil.sampleFor(Arrays.asList(false,true))).isEqualTo("trueがありました");
    }
    @Test
    public void sampleForTest2() {
        Assertions.assertThat(JavaUtil.sampleFor(Arrays.asList(false,false))).isEqualTo("全てfalseでした");
    }
    @Test
    public void sampleErrorTest1() {
        Assertions.assertThat(JavaUtil.sampleError("1")).isEqualTo("数字でした");
    }
    @Test
    public void sampleErrorTest2() {
        Assertions.assertThat(JavaUtil.sampleError("a")).isEqualTo("数字以外でした");
    }
    @Test
    public void sampleMapTest1() {
        Map<Integer, String> testMap = new HashMap<Integer, String>();
        testMap.put(1, "test");
        testMap.put(2, "Map");
        Assertions.assertThat(JavaUtil.sampleMap(testMap)).isEqualTo("testがありました");
    }
    @Test
    public void sampleMapTest2() {
        Map<Integer, String> testMap = new HashMap<Integer, String>();
        testMap.put(1, "Map");
        testMap.put(2, "Map");
        Assertions.assertThat(JavaUtil.sampleMap(testMap)).isEqualTo("testがありません");
    }
    @Test
    public void sampleVariableLength() {
        Assertions.assertThat(JavaUtil.sampleVariableLength(1,2,3)).isEqualTo(6);
    }
}
