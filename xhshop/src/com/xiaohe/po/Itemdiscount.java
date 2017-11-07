package com.xiaohe.po;

import java.util.Date;

public class Itemdiscount {
    private Integer disid;

    private Integer did;

    private Float disc;

    private Date dstart;

    private Date dend;

    public Integer getDisid() {
        return disid;
    }

    public void setDisid(Integer disid) {
        this.disid = disid;
    }

    public Integer getDid() {
        return did;
    }

    public void setDid(Integer did) {
        this.did = did;
    }

    public Float getDisc() {
        return disc;
    }

    public void setDisc(Float disc) {
        this.disc = disc;
    }

    public Date getDstart() {
        return dstart;
    }

    public void setDstart(Date dstart) {
        this.dstart = dstart;
    }

    public Date getDend() {
        return dend;
    }

    public void setDend(Date dend) {
        this.dend = dend;
    }
}