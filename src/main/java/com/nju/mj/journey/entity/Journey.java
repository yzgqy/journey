package com.nju.mj.journey.entity;

import java.io.Serializable;
import java.util.Date;

public class Journey implements Serializable {
    private String id;

    private String theme;

    private Date starttime;

    private Date endtime;

    private String assemblypoint;

    private Integer money;

    private Date createdat;

    private Date updateat;

    private Integer flag;

    private String code;

    private Integer ispublic;

    private Integer isfind;

    private String cover;

    private String place;

    private String desc;

    private byte[] sponsorid;

    private static final long serialVersionUID = 1L;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getTheme() {
        return theme;
    }

    public void setTheme(String theme) {
        this.theme = theme == null ? null : theme.trim();
    }

    public Date getStarttime() {
        return starttime;
    }

    public void setStarttime(Date starttime) {
        this.starttime = starttime;
    }

    public Date getEndtime() {
        return endtime;
    }

    public void setEndtime(Date endtime) {
        this.endtime = endtime;
    }

    public String getAssemblypoint() {
        return assemblypoint;
    }

    public void setAssemblypoint(String assemblypoint) {
        this.assemblypoint = assemblypoint == null ? null : assemblypoint.trim();
    }

    public Integer getMoney() {
        return money;
    }

    public void setMoney(Integer money) {
        this.money = money;
    }

    public Date getCreatedat() {
        return createdat;
    }

    public void setCreatedat(Date createdat) {
        this.createdat = createdat;
    }

    public Date getUpdateat() {
        return updateat;
    }

    public void setUpdateat(Date updateat) {
        this.updateat = updateat;
    }

    public Integer getFlag() {
        return flag;
    }

    public void setFlag(Integer flag) {
        this.flag = flag;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code == null ? null : code.trim();
    }

    public Integer getIspublic() {
        return ispublic;
    }

    public void setIspublic(Integer ispublic) {
        this.ispublic = ispublic;
    }

    public Integer getIsfind() {
        return isfind;
    }

    public void setIsfind(Integer isfind) {
        this.isfind = isfind;
    }

    public String getCover() {
        return cover;
    }

    public void setCover(String cover) {
        this.cover = cover == null ? null : cover.trim();
    }

    public String getPlace() {
        return place;
    }

    public void setPlace(String place) {
        this.place = place == null ? null : place.trim();
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc == null ? null : desc.trim();
    }

    public byte[] getSponsorid() {
        return sponsorid;
    }

    public void setSponsorid(byte[] sponsorid) {
        this.sponsorid = sponsorid;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", theme=").append(theme);
        sb.append(", starttime=").append(starttime);
        sb.append(", endtime=").append(endtime);
        sb.append(", assemblypoint=").append(assemblypoint);
        sb.append(", money=").append(money);
        sb.append(", createdat=").append(createdat);
        sb.append(", updateat=").append(updateat);
        sb.append(", flag=").append(flag);
        sb.append(", code=").append(code);
        sb.append(", ispublic=").append(ispublic);
        sb.append(", isfind=").append(isfind);
        sb.append(", cover=").append(cover);
        sb.append(", place=").append(place);
        sb.append(", desc=").append(desc);
        sb.append(", sponsorid=").append(sponsorid);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}