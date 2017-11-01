package com.xiaohe.po;

import java.util.Date;

public class Backstock {
    private Integer bsid;

    private Integer sid;

    private Integer iid;

    private String uname;

    private String bsreson;

    private Date bstime;

    public Integer getBsid() {
        return bsid;
    }

    public void setBsid(Integer bsid) {
        this.bsid = bsid;
    }

    public Integer getSid() {
        return sid;
    }

    public void setSid(Integer sid) {
        this.sid = sid;
    }

    public Integer getIid() {
        return iid;
    }

    public void setIid(Integer iid) {
        this.iid = iid;
    }

    public String getUname() {
        return uname;
    }

    public void setUname(String uname) {
        this.uname = uname == null ? null : uname.trim();
    }

    public String getBsreson() {
        return bsreson;
    }

    public void setBsreson(String bsreson) {
        this.bsreson = bsreson == null ? null : bsreson.trim();
    }

    public Date getBstime() {
        return bstime;
    }

    public void setBstime(Date bstime) {
        this.bstime = bstime;
    }
}