/*
 * 文件名：ReportService.java
 * 版权：Copyright by www.cheer.com
 * 描述：
 * 修改人：abc
 * 修改时间：2017年11月9日
 */

package com.cheer.spring.ex01;

public class ReportService
{
    private ReportGenerator reportGenerator;

    public void setReportGenerator(ReportGenerator reportGenerator)
    {
        this.reportGenerator = reportGenerator;
    }

    public void generateMonthlyReport()
    {
        this.reportGenerator.generate();
    }
}
