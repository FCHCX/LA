package com.xiaohe.po;

public class Shaddress {
    private Integer shid;

    private String uname;

    private String saddress;

    public Integer getShid() {
        return shid;
    }

    public void setShid(Integer shid) {
        this.shid = shid;
    }

    public String getUname() {
        return uname;
    }

    public void setUname(String uname) {
        this.uname = uname == null ? null : uname.trim();
    }

    public String getSaddress() {
        return saddress;
    }

    public void setSaddress(String saddress) {
        this.saddress = saddress == null ? null : saddress.trim();
    }
}