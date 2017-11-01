package com.xiaohe.po;

import java.util.Date;

public class Notice {
    private Integer ntid;

    private Integer nid;

    private String ntcontent;

    private Date ntime;

    public Integer getNtid() {
        return ntid;
    }

    public void setNtid(Integer ntid) {
        this.ntid = ntid;
    }

    public Integer getNid() {
        return nid;
    }

    public void setNid(Integer nid) {
        this.nid = nid;
    }

    public String getNtcontent() {
        return ntcontent;
    }

    public void setNtcontent(String ntcontent) {
        this.ntcontent = ntcontent == null ? null : ntcontent.trim();
    }

    public Date getNtime() {
        return ntime;
    }

    public void setNtime(Date ntime) {
        this.ntime = ntime;
    }
}