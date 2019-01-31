package com.nju.mj.journey.entity;

import java.io.Serializable;
import java.util.Date;

public class Participant implements Serializable {
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

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", journeyid=").append(journeyid);
        sb.append(", userid=").append(userid);
        sb.append(", isarrived=").append(isarrived);
        sb.append(", ishome=").append(ishome);
        sb.append(", isconfirmed=").append(isconfirmed);
        sb.append(", isinvited=").append(isinvited);
        sb.append(", createat=").append(createat);
        sb.append(", updatedat=").append(updatedat);
        sb.append(", desc=").append(desc);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}