package com.xiaohe.po;

import java.util.Date;

public class Indent {
    private Integer bid;

    private String bconsignee;

    private Integer bsid;

    private Integer baddress;

    private Integer bphone;

    private Integer bdid;

    private Date bdate;

    private String buname;

    private String bstatus;

    private Float bprice;

    private String bdeliver;

    private Date bordertime;

    public Integer getBid() {
        return bid;
    }

    public void setBid(Integer bid) {
        this.bid = bid;
    }

    public String getBconsignee() {
        return bconsignee;
    }

    public void setBconsignee(String bconsignee) {
        this.bconsignee = bconsignee == null ? null : bconsignee.trim();
    }

    public Integer getBsid() {
        return bsid;
    }

    public void setBsid(Integer bsid) {
        this.bsid = bsid;
    }

    public Integer getBaddress() {
        return baddress;
    }

    public void setBaddress(Integer baddress) {
        this.baddress = baddress;
    }

    public Integer getBphone() {
        return bphone;
    }

    public void setBphone(Integer bphone) {
        this.bphone = bphone;
    }

    public Integer getBdid() {
        return bdid;
    }

    public void setBdid(Integer bdid) {
        this.bdid = bdid;
    }

    public Date getBdate() {
        return bdate;
    }

    public void setBdate(Date bdate) {
        this.bdate = bdate;
    }

    public String getBuname() {
        return buname;
    }

    public void setBuname(String buname) {
        this.buname = buname == null ? null : buname.trim();
    }

    public String getBstatus() {
        return bstatus;
    }

    public void setBstatus(String bstatus) {
        this.bstatus = bstatus == null ? null : bstatus.trim();
    }

    public Float getBprice() {
        return bprice;
    }

    public void setBprice(Float bprice) {
        this.bprice = bprice;
    }

    public String getBdeliver() {
        return bdeliver;
    }

    public void setBdeliver(String bdeliver) {
        this.bdeliver = bdeliver == null ? null : bdeliver.trim();
    }

    public Date getBordertime() {
        return bordertime;
    }

    public void setBordertime(Date bordertime) {
        this.bordertime = bordertime;
    }
}