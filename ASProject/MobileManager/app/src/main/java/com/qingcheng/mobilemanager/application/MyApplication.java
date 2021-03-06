package com.qingcheng.mobilemanager.application;

import android.app.Application;
import android.content.Context;
import android.os.Handler;

/**
 * Description:
 * Copyright  : Copyright (c) 2016
 * Company    : RGK
 * Author     : qi.guan
 * Date       : 2016/12/20 16:36
 */

public class MyApplication extends Application {

    private static Context context;
    private static Handler handler;
    private static int mainThreadId;

    @Override
    public void onCreate() {
        super.onCreate();
        context = getApplicationContext();
        handler = new Handler();
        mainThreadId = android.os.Process.myTid();
    }

    public static Context getContext(){
        return context;
    }
    public static Handler getHandler(){
        return handler;
    }
    public static int getMainThreadId(){
        return mainThreadId;
    }
}
