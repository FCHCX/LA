package com.xiaohe.po;

public class Store {
    private Integer stid;

    private String splace;

    private Integer smount;

    private Integer sid;

    public Integer getStid() {
        return stid;
    }

    public void setStid(Integer stid) {
        this.stid = stid;
    }

    public String getSplace() {
        return splace;
    }

    public void setSplace(String splace) {
        this.splace = splace == null ? null : splace.trim();
    }

    public Integer getSmount() {
        return smount;
    }

    public void setSmount(Integer smount) {
        this.smount = smount;
    }

    public Integer getSid() {
        return sid;
    }

    public void setSid(Integer sid) {
        this.sid = sid;
    }
}