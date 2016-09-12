package com.abings.adaptermodel.Adapter;

/**
 * Created by HaomingXu on 2016/9/12.
 */
public class Adapter extends Target {
    private Adaptee adaptee = new Adaptee();
    @Override
    public String writeprogram(String english) {
        return adaptee.writeprogram(english);
    }
}
