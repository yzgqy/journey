package com.nju.mj.journey.entity;

import java.io.Serializable;
import java.util.Date;

public class Comment implements Serializable {
    private String id;

    private String journeyid;

    private String userid;

    private String pid;

    private Date createdat;

    private Integer flag;

    private String comment;

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

    public String getPid() {
        return pid;
    }

    public void setPid(String pid) {
        this.pid = pid == null ? null : pid.trim();
    }

    public Date getCreatedat() {
        return createdat;
    }

    public void setCreatedat(Date createdat) {
        this.createdat = createdat;
    }

    public Integer getFlag() {
        return flag;
    }

    public void setFlag(Integer flag) {
        this.flag = flag;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment == null ? null : comment.trim();
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
        sb.append(", pid=").append(pid);
        sb.append(", createdat=").append(createdat);
        sb.append(", flag=").append(flag);
        sb.append(", comment=").append(comment);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}