package com.hsj.me.base;

import android.content.Context;

import com.hsj.base.BaseApplication;
import com.squareup.leakcanary.LeakCanary;

/**
 * @Author:HSJ
 * @E-mail:mr.ajun@foxmail.com
 * @Date:2017/5/27 16:01
 * @Class:App
 * @Description:
 */
public class AppMe extends BaseApplication {

    public static Context appContext;

    @Override
    protected void initModule() {
        if (LeakCanary.isInAnalyzerProcess(this)) return;
        LeakCanary.install(this);

        appContext = getApplicationContext();

    }

}
