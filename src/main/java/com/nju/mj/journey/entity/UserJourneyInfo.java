package com.nju.mj.journey.entity;

import java.io.Serializable;

public class UserJourneyInfo implements Serializable {
    private String id;

    private String journeyid;

    private String userid;

    private Integer type;

    private Integer ispublic;

    private static final long serialVersionUID = 1L;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getJourneyid() {
        return journeyid;
    }

    public void setJourneyid(String journeyid) {
        this.journeyid = journeyid == null ? null : journeyid.trim();
    }

    public String getUserid() {
        return userid;
    }

    public void setUserid(String userid) {
        this.userid = userid == null ? null : userid.trim();
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public Integer getIspublic() {
        return ispublic;
    }

    public void setIspublic(Integer ispublic) {
        this.ispublic = ispublic;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", journeyid=").append(journeyid);
        sb.append(", userid=").append(userid);
        sb.append(", type=").append(type);
        sb.append(", ispublic=").append(ispublic);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}