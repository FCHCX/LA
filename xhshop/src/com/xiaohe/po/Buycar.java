package com.xiaohe.po;

public class Buycar {
    private Integer bid;

    private Integer stid;

    private String bimgpath;

    private String uname;

    private Float sprice;

    private Integer snum;

    private Float ssumprice;

    private String soperate;

    public Integer getBid() {
        return bid;
    }

    public void setBid(Integer bid) {
        this.bid = bid;
    }

    public Integer getStid() {
        return stid;
    }

    public void setStid(Integer stid) {
        this.stid = stid;
    }

    public String getBimgpath() {
        return bimgpath;
    }

    public void setBimgpath(String bimgpath) {
        this.bimgpath = bimgpath == null ? null : bimgpath.trim();
    }

    public String getUname() {
        return uname;
    }

    public void setUname(String uname) {
        this.uname = uname == null ? null : uname.trim();
    }

    public Float getSprice() {
        return sprice;
    }

    public void setSprice(Float sprice) {
        this.sprice = sprice;
    }

    public Integer getSnum() {
        return snum;
    }

    public void setSnum(Integer snum) {
        this.snum = snum;
    }

    public Float getSsumprice() {
        return ssumprice;
    }

    public void setSsumprice(Float ssumprice) {
        this.ssumprice = ssumprice;
    }

    public String getSoperate() {
        return soperate;
    }

    public void setSoperate(String soperate) {
        this.soperate = soperate == null ? null : soperate.trim();
    }
}