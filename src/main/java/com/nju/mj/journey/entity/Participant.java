package com.nju.mj.journey.entity;

import java.util.Date;

public class Participant {
    private String id;

    private String journeyid;

    private String userid;

    private Integer isarrived;

    private Integer ishome;

    private Integer isconfirmed;

    private Integer isinvited;

    private Date createat;

    private Date updatedat;

    private String desc;

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

    public Integer getIsarrived() {
        return isarrived;
    }

    public void setIsarrived(Integer isarrived) {
        this.isarrived = isarrived;
    }

    public Integer getIshome() {
        return ishome;
    }

    public void setIshome(Integer ishome) {
        this.ishome = ishome;
    }

    public Integer getIsconfirmed() {
        return isconfirmed;
    }

    public void setIsconfirmed(Integer isconfirmed) {
        this.isconfirmed = isconfirmed;
    }

    public Integer getIsinvited() {
        return isinvited;
    }

    public void setIsinvited(Integer isinvited) {
        this.isinvited = isinvited;
    }

    public Date getCreateat() {
        return createat;
    }

    public void setCreateat(Date createat) {
        this.createat = createat;
    }

    public Date getUpdatedat() {
        return updatedat;
    }

    public void setUpdatedat(Date updatedat) {
        this.updatedat = updatedat;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc == null ? null : desc.trim();
    }
}