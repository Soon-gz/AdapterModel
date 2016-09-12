package com.abings.adaptermodel.Builder;

/**
 * Created by HaomingXu on 2016/9/12.
 */
public class Director {
    public static Progremer createProgremer(Builder builder){
        builder.setContry();
        return builder.getProgremer();
    }
}
