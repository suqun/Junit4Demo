package com.larry.util;

import org.junit.Ignore;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by larry on 15-5-16.
 * junit4注解
 */
public class AnotationTest {
    /**
     * @Test:将一个普通的方法修饰成为一个测试方法
     *      @Test(expected = **.class)
     *      @Test(timeout=毫秒)
     * @BeforeClass:它会在所有的方法运行前被执行,static修饰
     * @AfterClass:它会在所有的方法运行后被执行,static修饰
     * @Before:会在每一个测试方法运行前被执行一次
     * @After:会在每一个测试方法运行后被执行一次
     * @Ignore:所修饰的测试方法会被测试运行器忽略
     * @RunWith:可以更改测试运行器 org.junit.runner.Runner
     * assert 断言
     */

    @Ignore
    @Test(expected = ArithmeticException.class)
    public void testDivide() throws Exception {
        assertEquals(3,new Calculate().add(6,0));
    }

    @Ignore
    @Test(timeout = 2000)
    public void testWhile(){
        while (true){
            System.out.println("run forever ...");
        }
    }

    //测试性能
    @Test(timeout = 3000)
    public void testReadFile(){
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
