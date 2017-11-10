/*
 * 文件名：MasterDaoHibernateImpl.java
 * 版权：Copyright by www.cheer.com
 * 描述：
 * 修改人：abc
 * 修改时间：2017年11月9日
 */

package com.cheer.spring.ioc.anntation.dao.impl;

import org.springframework.stereotype.Repository;

import com.cheer.spring.ioc.anntation.dao.MasterDao;

@Repository("MasterDaoHibernateImpl")
public class MasterDaoHibernateImpl implements MasterDao
{
    @Override
    public int find(String name, String password)
    {
        if ("scott".equals(name) && "tiger".equals(password))
        {
            return 1;
        }
        return 0;
    }
}
