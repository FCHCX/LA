package com.xiaohe.po;

public class Controllers {
    private Integer cid;

    private String cname;

    private String cpwd;

    private Integer croleid;

    private String csex;
    
    private String crole;

    
    public String getCrole() {
		return crole;
	}

	public void setCrole(String crole) {
		this.crole = crole;
	}

	public Integer getCid() {
        return cid;
    }

    public void setCid(Integer cid) {
        this.cid = cid;
    }

    public String getCname() {
        return cname;
    }

    public void setCname(String cname) {
        this.cname = cname == null ? null : cname.trim();
    }

    public String getCpwd() {
        return cpwd;
    }

    public void setCpwd(String cpwd) {
        this.cpwd = cpwd == null ? null : cpwd.trim();
    }

    public Integer getCroleid() {
        return croleid;
    }

    public void setCroleid(Integer croleid) {
        this.croleid = croleid;
    }

    public String getCsex() {
        return csex;
    }

    public void setCsex(String csex) {
        this.csex = csex == null ? null : csex.trim();
    }
}