package com.larry.util;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by larry on 15-5-16.
 * ctrl + shift + F10 运行测试
 * 1.测试方法必须使用@Test进行修饰（非继承TestCase时）
 * 2.测试方法必须使用public void 进行修饰，不能带任何参数
 * 3.新建一个源代码目录存放我们的测试代码
 * 4.测试类的包应该和被测试类保持一致
 * 5.测试单元中的每个方法必须可以独立测试，测试方法间不能依赖
 * 6.测试类使用Test作为类名的后缀
 * 7.测试方法使用test作为方法名的前缀
 */
public class CalculateTest {

    /**
     * 1.Failure 一般由单元测试使用的断言方法失败引起的，这表示测试点
     * 发现了问题，就是说程序输出的结果和我们预期的不一样。
     * 2.Error 是由代码异常引起的，他可以产生于测试代码本身的错误，
     * 也可以是被测试代码中的一个隐藏的bug
     * 3.测试用例不是用来证明你是对的，而是用来证明你没有错。
     *
     */
    @Test
    public void testAdd() throws Exception {
        assertEquals(5,new Calculate().add(1,2));
    }

    @Test
    public void testSubtract() throws Exception {

    }

    @Test
    public void testMultiply() throws Exception {

    }

    @Test
    public void testDivide() throws Exception {
        assertEquals(3,new Calculate().add(6,0));
    }
}