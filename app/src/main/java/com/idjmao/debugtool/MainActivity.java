package com.idjmao.debugtool;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

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
    }

    private void addlog() {
        Log.i("gh", "addlog: ");
    }
}
