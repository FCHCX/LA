package com.xiaohe.po;

public class Point {
    private Integer pid;

    private String pname;

    private Float ppoint;

    public Integer getPid() {
        return pid;
    }

    public void setPid(Integer pid) {
        this.pid = pid;
    }

    public String getPname() {
        return pname;
    }

    public void setPname(String pname) {
        this.pname = pname == null ? null : pname.trim();
    }

    public Float getPpoint() {
        return ppoint;
    }

    public void setPpoint(Float ppoint) {
        this.ppoint = ppoint;
    }
}