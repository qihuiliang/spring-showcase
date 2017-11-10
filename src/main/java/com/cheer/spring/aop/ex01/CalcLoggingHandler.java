/*
 * 文件名：CalcLoggingHandler.java
 * 版权：Copyright by www.cheer.com
 * 描述：
 * 修改人：abc
 * 修改时间：2017年11月9日
 */

package com.cheer.spring.aop.ex01;


import java.lang.reflect.Method;
import java.util.Arrays;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.cglib.proxy.InvocationHandler;
import org.springframework.cglib.proxy.Proxy;

public class CalcLoggingHandler implements InvocationHandler
{
    private static final Logger LOGGER = LogManager.getLogger(CalcLoggingHandler.class);
    
    private Object target;

    public CalcLoggingHandler(Object target)
    {
        super();
        this.target = target;
    }
    
    @Override
    public Object invoke(Object proxy, Method method, Object[] args)
        throws Throwable
    {
        LOGGER.info("This method" + method.getName() + "() begin with" + Arrays.toString(args));
        Object result = method.invoke(target, args);
        LOGGER.info("This method" + method.getName() + "() end with" + result);
        return result;
    }
    
    public static Object createProxy(Object target)
    {
        return Proxy.newProxyInstance(target.getClass().getClassLoader(), target.getClass().getInterfaces(), new CalcLoggingHandler(target));
    }
}
