/*
 * 文件名：CalcImpl.java 版权：Copyright by www.cheer.com 描述： 修改人：abc 修改时间：2017年11月9日
 */

package com.cheer.spring.aop.ex02;


import org.springframework.stereotype.Component;

import com.cheer.spring.aop.ex02.Calc;


@Component
public class CalcImpl implements Calc
{
    @Override
    public double add(double num1, double num2)
    {
        return (num1 + num2);
    }
}
