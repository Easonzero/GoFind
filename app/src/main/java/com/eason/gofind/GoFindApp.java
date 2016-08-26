package com.eason.gofind;

import android.app.Application;

import org.xutils.x;

/**
 * Created by eason on 8/26/16.
 */
public class GoFindApp extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        x.Ext.init(this);
    }
}
