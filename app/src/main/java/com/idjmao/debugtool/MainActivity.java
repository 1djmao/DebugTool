package com.idjmao.debugtool;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.apkfuns.logutils.LogUtils;
import com.idjmao.debugtoollib.collector.DeviceCollector;
import com.idjmao.debugtoollib.LogTool;
import com.idjmao.debugtoollib.collector.ShardPreCollector;
import com.idjmao.debugtoollib.collector.SysSettingCollector;

import static com.idjmao.debugtool.Appp.getInstance;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findViewById(R.id.addlog).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                addlog();
            }
        });
        findViewById(R.id.showlog).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showLog();
            }
        });
        findViewById(R.id.nullpoint).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                nullPoint();
            }
        });
        findViewById(R.id.new_thread_nullpoint).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                newThreadNullPoint();
            }
        });
        findViewById(R.id.getdevice).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                getDeviceInfo();
            }
        });
        findViewById(R.id.getshardpre).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                getShardPreInfo();
            }
        });
        findViewById(R.id.getsetting).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                getSetting();
            }
        });

        LogTool logTool = new LogTool(getInstance());
    }

    private void getSetting() {
        LogUtils.i(new SysSettingCollector(getInstance()).collect());
    }

    private void getShardPreInfo() {
        LogUtils.i(new ShardPreCollector(getInstance(),null).collect());
    }

    private void getDeviceInfo() {

        LogUtils.i(new DeviceCollector().collect());
    }

    private void nullPoint() {
        String s=null;
        s.toCharArray();
    }
    private void newThreadNullPoint(){
        new Thread(new Runnable() {
            @Override
            public void run() {
                String s=null;
                s.toCharArray();
            }
        }).start();
    }

    private void addlog() {
        LogUtils.d("12345");
    }

    private void showLog(){
        LogTool.showLog(this);
    }
}
