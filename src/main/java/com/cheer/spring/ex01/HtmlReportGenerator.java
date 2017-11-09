/*
 * 文件名：HtmlReportGenerator.java
 * 版权：Copyright by www.cheer.com
 * 描述：
 * 修改人：abc
 * 修改时间：2017年11月9日
 */

package com.cheer.spring.ex01;

public class HtmlReportGenerator implements ReportGenerator
{
    @Override
    public void generate()
    {
        System.out.println("html生成器。。。");
    }
}
