package com.nju.mj.journey.entity;

import java.util.Date;

public class Journey {
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Journey journey = (Journey) o;

        if (id != null ? !id.equals(journey.id) : journey.id != null) return false;
        if (theme != null ? !theme.equals(journey.theme) : journey.theme != null) return false;
        if (starttime != null ? !starttime.equals(journey.starttime) : journey.starttime != null) return false;
        if (endtime != null ? !endtime.equals(journey.endtime) : journey.endtime != null) return false;
        if (assemblypoint != null ? !assemblypoint.equals(journey.assemblypoint) : journey.assemblypoint != null)
            return false;
        if (money != null ? !money.equals(journey.money) : journey.money != null) return false;
        if (createdat != null ? !createdat.equals(journey.createdat) : journey.createdat != null) return false;
        if (updateat != null ? !updateat.equals(journey.updateat) : journey.updateat != null) return false;
        if (flag != null ? !flag.equals(journey.flag) : journey.flag != null) return false;
        if (code != null ? !code.equals(journey.code) : journey.code != null) return false;
        if (ispublic != null ? !ispublic.equals(journey.ispublic) : journey.ispublic != null) return false;
        if (isfind != null ? !isfind.equals(journey.isfind) : journey.isfind != null) return false;
        if (cover != null ? !cover.equals(journey.cover) : journey.cover != null) return false;
        return place != null ? place.equals(journey.place) : journey.place == null;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (theme != null ? theme.hashCode() : 0);
        result = 31 * result + (starttime != null ? starttime.hashCode() : 0);
        result = 31 * result + (endtime != null ? endtime.hashCode() : 0);
        result = 31 * result + (assemblypoint != null ? assemblypoint.hashCode() : 0);
        result = 31 * result + (money != null ? money.hashCode() : 0);
        result = 31 * result + (createdat != null ? createdat.hashCode() : 0);
        result = 31 * result + (updateat != null ? updateat.hashCode() : 0);
        result = 31 * result + (flag != null ? flag.hashCode() : 0);
        result = 31 * result + (code != null ? code.hashCode() : 0);
        result = 31 * result + (ispublic != null ? ispublic.hashCode() : 0);
        result = 31 * result + (isfind != null ? isfind.hashCode() : 0);
        result = 31 * result + (cover != null ? cover.hashCode() : 0);
        result = 31 * result + (place != null ? place.hashCode() : 0);
        return result;
    }
}