package com.nju.mj.journey.utils;

import java.util.UUID;

public class Myuuid {
    public static String getUUID(){
        String uuid = UUID.randomUUID().toString().replace("-", "").toLowerCase();
        return uuid;
    }

    public static void main(String[] args) {
        System.out.println(getUUID());
        System.out.println(getUUID());
        System.out.println(getUUID());
    }
}
