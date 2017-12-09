package com.idjmao.debugtoollib.collector;

import android.app.Application;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;

/**
 * Created by 1djmao on 2017/12/9.
 * 收集应用的版本号，所有权限,
 */

public class AppInfoCollector {

    Application mApp;

    public AppInfoCollector(Application app) {
        mApp = app;
    }

    public String collect(){
        StringBuilder string=new StringBuilder("【应用信息】");



        PackageManager manager = mApp.getPackageManager();
        PackageInfo info = null;
        try {
            info = manager.getPackageInfo(mApp.getPackageName(), 0);
            String version = info.versionName;
            string.append("\nversion: "+version);
        } catch (PackageManager.NameNotFoundException e) {
            e.printStackTrace();
            string.append("\nversion: ");
        }


        return string.toString();
    }

}
