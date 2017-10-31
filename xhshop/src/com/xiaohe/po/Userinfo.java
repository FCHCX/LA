package com.xiaohe.po;

public class Userinfo {
    private String ufuname;

    private String ufsex;

    private String ufsheng;

    private String ufshi;

    private String ufphone;

    private String ufname;

    private String uqustion;

    private String uanswer;

    private Integer uaddress;

    public String getUfuname() {
        return ufuname;
    }

    public void setUfuname(String ufuname) {
        this.ufuname = ufuname == null ? null : ufuname.trim();
    }

    public String getUfsex() {
        return ufsex;
    }

    public void setUfsex(String ufsex) {
        this.ufsex = ufsex == null ? null : ufsex.trim();
    }

    public String getUfsheng() {
        return ufsheng;
    }

    public void setUfsheng(String ufsheng) {
        this.ufsheng = ufsheng == null ? null : ufsheng.trim();
    }

    public String getUfshi() {
        return ufshi;
    }

    public void setUfshi(String ufshi) {
        this.ufshi = ufshi == null ? null : ufshi.trim();
    }

    public String getUfphone() {
        return ufphone;
    }

    public void setUfphone(String ufphone) {
        this.ufphone = ufphone == null ? null : ufphone.trim();
    }

    public String getUfname() {
        return ufname;
    }

    public void setUfname(String ufname) {
        this.ufname = ufname == null ? null : ufname.trim();
    }

    public String getUqustion() {
        return uqustion;
    }

    public void setUqustion(String uqustion) {
        this.uqustion = uqustion == null ? null : uqustion.trim();
    }

    public String getUanswer() {
        return uanswer;
    }

    public void setUanswer(String uanswer) {
        this.uanswer = uanswer == null ? null : uanswer.trim();
    }

    public Integer getUaddress() {
        return uaddress;
    }

    public void setUaddress(Integer uaddress) {
        this.uaddress = uaddress;
    }
}