package com.imooc.demo.entity;

import java.util.Date;

public class Area {
    private Integer areaId;
    private String areaName;
    private Integer priorty;
    private Date createTime;
    private Date lastEditIime;

    public Integer getAreaId() {
        return areaId;
    }

    public void setAreaId(Integer areaId) {
        this.areaId = areaId;
    }

    public String getAreaName() {
        return areaName;
    }

    public void setAreaName(String areaName) {
        this.areaName = areaName;
    }

    public Integer getPriorty() {
        return priorty;
    }

    public void setPriorty(Integer priorty) {
        this.priorty = priorty;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getLastEditIime() {
        return lastEditIime;
    }

    public void setLastEditIime(Date lastEditIime) {
        this.lastEditIime = lastEditIime;
    }

}
