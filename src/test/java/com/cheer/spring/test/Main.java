/*
 * 文件名：Main.java 版权：Copyright by www.cheer.com 描述： 修改人：abc 修改时间：2017年11月9日
 */

package com.cheer.spring.test;

import org.junit.Test;

import com.cheer.spring.aop.ex01.CalcImpl;
import com.cheer.spring.aop.ex01.CalcLoggingHandler;
import com.cheer.spring.aop.ex01.CalcValidationHandler;
import com.cheer.spring.aop.ex02.Calc;


public class Main
{
    @Test
    public void test()
    {
        Calc calc = new CalcImpl();

        Calc proxy = (Calc)CalcLoggingHandler.createProxy(CalcValidationHandler.createProxy(calc));

        System.out.println(proxy.add(12, 13));
    }
}
/*
 * Calc calc = new CalcImpl(); Calc proxy =
 * (Calc)CalcLoggingHandler.createProxy(CalcValidationHandler.createProxy(calc)); 
 * Proxy.add(1, -1);
 * }
 */
