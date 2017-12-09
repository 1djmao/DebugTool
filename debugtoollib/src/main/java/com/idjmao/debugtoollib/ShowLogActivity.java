package com.idjmao.debugtoollib;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ShowLogActivity extends AppCompatActivity {
    TextView mTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show_log);
        mTextView=findViewById(R.id.tv_showlog);
        File file=new File(getExternalCacheDir().getPath()+"/log.txt");
        if (!file.exists()){
            mTextView.setText("log 文件不存在");
            return;
        }
        mTextView.setText(readtxt(file.getAbsolutePath()));



    }

    private String readtxt(String path){

        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader(new File(path)));
            String s="";
            String s1;
            while ((s1=bufferedReader.readLine())!=null){
                s=s+s1;
            }
            return s;
        } catch (FileNotFoundException e){
            e.printStackTrace();
            return "";
        } catch (IOException e) {
            e.printStackTrace();
            return "";
        }
    }
}
