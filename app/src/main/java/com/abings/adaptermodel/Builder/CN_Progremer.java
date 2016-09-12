package com.abings.adaptermodel.Builder;

/**
 * Created by HaomingXu on 2016/9/12.
 */
public class CN_Progremer extends Builder{

    private Progremer progremer = new Progremer();
    @Override
    public void setContry() {
        progremer.setContry("中国程序猿");
    }

    @Override
    public Progremer getProgremer() {
        return progremer;
    }
}
