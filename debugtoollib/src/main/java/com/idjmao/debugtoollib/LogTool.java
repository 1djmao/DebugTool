package com.idjmao.debugtoollib;

import android.app.Activity;
import android.app.Application;
import android.content.Intent;

import com.apkfuns.log2file.LogFileEngineFactory;
import com.apkfuns.logutils.LogUtils;

import java.io.File;

/**
 * Created by 1djmao on 2017/12/8.
 */

public class LogTool {
    Application mApp;
    File logFile;

    public LogTool(Application app) {
        mApp = app;
        LogUtils.getLogConfig()
                .configAllowLog(true)
                .configTagPrefix(app.getPackageName())
                .configShowBorders(true);

        LogUtils.getLog2FileConfig().configLog2FileEnable(true)
                .configLog2FilePath(app.getExternalCacheDir().getPath())
                .configLog2FileNameFormat("log.txt")
                .configLogFileEngine(new LogFileEngineFactory());
        logFile=LogUtils.getLog2FileConfig().getLogFile();
    }

    public static void showLog(Activity activity){
        activity.startActivity(new Intent(activity,ShowLogActivity.class));
    }


}
