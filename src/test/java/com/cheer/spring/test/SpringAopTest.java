/*
 * 文件名：SpringAopTest2.java 版权：Copyright by www.cheer.com 描述： 修改人：abc 修改时间：2017年11月10日
 */

package com.cheer.spring.test;


import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

import com.cheer.spring.aop.ex02.Calc;


@RunWith(SpringRunner.class)
@ContextConfiguration(locations = "classpath*:spring/spring.*.xml")
public class SpringAopTest
{
    @Autowired
    Calc calc;

    @Test
    public void test()
    {
        calc.add(1, 2);
    }
}
