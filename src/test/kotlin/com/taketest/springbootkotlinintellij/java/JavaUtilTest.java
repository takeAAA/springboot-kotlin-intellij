package com.taketest.springbootkotlinintellij.java;

import org.assertj.core.api.Assertions;
import org.junit.Test;

import java.util.Arrays;

public class JavaUtilTest {
    @Test
    public void sampleIfTest1() {
        JavaUtil javaUtil = new JavaUtil();
        Assertions.assertThat(javaUtil.sampleIf(null)).isEqualTo("空です");
    }
    @Test
    public void sampleIfTest2() {
        JavaUtil javaUtil = new JavaUtil();
        Assertions.assertThat(javaUtil.sampleIf("test")).isEqualTo("空ではありません");
    }
    @Test
    public void sampleSwitchTest1() {
        JavaUtil javaUtil = new JavaUtil();
        Assertions.assertThat(javaUtil.sampleSwitch(1)).isEqualTo("1です");
    }
    @Test
    public void sampleSwitchTest2() {
        JavaUtil javaUtil = new JavaUtil();
        Assertions.assertThat(javaUtil.sampleSwitch(2)).isEqualTo("2です");
    }
    @Test
    public void sampleSwitchTest3() {
        JavaUtil javaUtil = new JavaUtil();
        Assertions.assertThat(javaUtil.sampleSwitch(3)).isEqualTo("1と2以外です");
    }
    @Test
    public void sampleForTest1() {
        JavaUtil javaUtil = new JavaUtil();
        Assertions.assertThat(javaUtil.sampleFor(Arrays.asList(new Boolean[]{false,true}))).isEqualTo("trueがありました");
    }
    @Test
    public void sampleForTest2() {
        JavaUtil javaUtil = new JavaUtil();
        Assertions.assertThat(javaUtil.sampleFor(Arrays.asList(new Boolean[]{false,false}))).isEqualTo("全てfalseでした");
    }
    @Test
    public void sampleErrorTest1() {
        JavaUtil javaUtil = new JavaUtil();
        Assertions.assertThat(javaUtil.sampleError("1")).isEqualTo("数字でした");
    }
    @Test
    public void sampleErrorTest2() {
        JavaUtil javaUtil = new JavaUtil();
        Assertions.assertThat(javaUtil.sampleError("a")).isEqualTo("数字以外でした");
    }
}
