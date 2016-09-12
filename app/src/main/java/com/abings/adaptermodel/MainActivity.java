package com.abings.adaptermodel;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import com.abings.adaptermodel.Adapter.Adapter;
import com.abings.adaptermodel.Adapter.Target;
import com.abings.adaptermodel.Builder.AC_Progremer;
import com.abings.adaptermodel.Builder.CN_Progremer;
import com.abings.adaptermodel.Builder.Director;
import com.abings.adaptermodel.Builder.Progremer;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //通过建造者模式，创建程序猿
        Progremer AC_progremer = Director.createProgremer(new AC_Progremer());
        Progremer CN_progremer = Director.createProgremer(new CN_Progremer());
        //美国程序猿说
        AC_progremer.setMeaning("hey!gay,write program!");
        //创建一个Target，也就是美国程序猿的需求
        Target target = new Adapter();
        //通过翻译者，翻译给中国程序猿
        String cn_target = target.writeprogram(AC_progremer.getMeaning());
        //中国程序猿的理解
        CN_progremer.setMeaning(cn_target);
        Log.i("Tag","美国程序猿说："+cn_target);
    }
}
