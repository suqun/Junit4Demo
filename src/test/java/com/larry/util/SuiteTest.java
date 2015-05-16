package com.larry.util;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

/**
 * Created by larry on 15-5-16.
 * 测试套件(批量执行测试)
 */
@RunWith(Suite.class)
@Suite.SuiteClasses({JunitFlowTest.class,CalculateTest.class})
public class SuiteTest {
    /**
     * 测试套件就是组织测试类一起运行的
     *
     * 写一个作为测试套件的入口类，这个类里不包含其他方法
     * 更改测试运行器Suite.class
     * 将要测试的类作为数组传入到@Suite.SuiteClasses({})
     */
}
