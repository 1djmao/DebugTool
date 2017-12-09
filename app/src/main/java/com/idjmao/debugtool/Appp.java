package com.idjmao.debugtool;

import android.app.Application;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;

import com.apkfuns.logutils.LogUtils;

/**
 * Created by 1djmao on 2017/12/9.
 */

public class Appp extends Application {

    private static Appp instance;
    public static Appp getInstance() {
        return instance;
    }

    @Override
    public void onCreate() {
        super.onCreate();
        instance = this;

        Thread.setDefaultUncaughtExceptionHandler(new Thread.UncaughtExceptionHandler() {
            @Override
            public void uncaughtException(Thread t, Throwable e) {

                SharedPreferences preferences= PreferenceManager.getDefaultSharedPreferences(getInstance());
                SharedPreferences.Editor editor=preferences.edit();
                editor.putBoolean("isException",false);
                editor.commit();

                LogUtils.i(e);

                System.exit(0);
            }
        });
    }


}
