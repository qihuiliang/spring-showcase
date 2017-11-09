/*
 * 文件名：ReportGeneratorFactory.java
 * 版权：Copyright by www.cheer.com
 * 描述：
 * 修改人：abc
 * 修改时间：2017年11月9日
 */

package com.cheer.spring.ex01;

public class ReportGeneratorFactory
{
    public ReportGenerator getReportGenerator(int type)
    {
        if (type == 1)
        {
            return new HtmlReportGenerator();
        }

        if (type == 0)
        {
            return new PdfReportGenerator();
        }

        return null;
    }
}
