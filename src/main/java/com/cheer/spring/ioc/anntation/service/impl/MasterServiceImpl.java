/*
 * 文件名：MasterServiceImpl.java
 * 版权：Copyright by www.cheer.com
 * 描述：
 * 修改人：abc
 * 修改时间：2017年11月9日
 */

package com.cheer.spring.ioc.anntation.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.cheer.spring.ioc.anntation.dao.MasterDao;
import com.cheer.spring.ioc.anntation.service.MasterService;

@Service
public class MasterServiceImpl implements MasterService
{
    @Resource(name = "MasterDaoHibernateImpl")
    private MasterDao masterDao;

    @Override
    public int find(String username, String password)
    {
        return this.masterDao.find(username, password);
    }
}
