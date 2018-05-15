package com.imooc.demo.service.impl;

import com.imooc.demo.dao.AreaDao;
import com.imooc.demo.entity.Area;
import com.imooc.demo.service.AreaService;
import org.mockito.internal.exceptions.ExceptionIncludingMockitoWarnings;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;
import java.util.List;

@Service
public class AreaServiceImpl implements AreaService {
    @Autowired
    private AreaDao areaDao;

    @Override
    public List<Area> getAreaList() {
        return areaDao.queryArea();
    }

    @Override
    public Area getAreaById(int areaId) {
        int a = 1/0;
        return areaDao.queryAreaById(areaId);
    }

    @Transactional
    @Override
    public boolean addArea(Area area) {
        if(area.getAreaName() != null & !"".equals(area.getAreaName()))
        {
            area.setCreateTime(new Date());
            area.setLastEditTime(new Date());
            try{
                int effectedNum = areaDao.insertArea(area);
                if(effectedNum >0)
                {
                    return true;
                } else {
                    throw new RuntimeException();
                }
            } catch (Exception e) {
                throw new RuntimeException();
            }
        } else {
            throw new RuntimeException();
        }

    }

    @Transactional
    @Override
    public boolean modifyArea(Area area) {
        if(area.getAreaId() != null && area.getAreaId()>0) {
            area.setLastEditTime(new Date());
            try {
                int effectedNum = areaDao.updateArea(area);

                if (effectedNum > 0) {
                    return true;
                } else {
                    throw new RuntimeException();
                }
            } catch (Exception e) {
                throw new RuntimeException();
            }
        } else {
            throw new RuntimeException();
        }
    }

    @Override
    public boolean deleteArea(int areaId) {

        if(areaId>0) {
            try {
                int effectedNum = areaDao.deleteArea(areaId);
                if (effectedNum > 0) {
                    return true;
                } else {
                    throw new RuntimeException();
                }
            } catch (Exception e) {
                throw new RuntimeException();
            }
        } else {
            throw new RuntimeException();
        }
    }
}
