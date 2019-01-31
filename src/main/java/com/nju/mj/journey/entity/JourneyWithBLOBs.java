package com.nju.mj.journey.entity;

public class JourneyWithBLOBs extends Journey {
    private String desc;

    private byte[] sponsorid;

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
}