package com.zcoo.server;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.widget.Button;

import org.mortbay.ijetty.log.AndroidLog;


public class MainActivity extends ActionBarActivity implements View.OnClickListener {

    private Button mBtStart;
    private Button mBtStop;
    private Button mBtSetting;

    static {
        // 不使用jetty的XML解析验证
        System.setProperty("org.eclipse.jetty.xml.XmlParser.Validating", "false");
        // 使用android日志类
        System.setProperty("org.eclipse.jetty.util.log.class", "org.mortbay.ijetty.AndroidLog");
        org.eclipse.jetty.util.log.Log.setLog(new AndroidLog());
    }

    private void assignViews() {
        mBtStart = (Button) findViewById(R.id.bt_start);
        mBtStop = (Button) findViewById(R.id.bt_stop);
        mBtSetting = (Button) findViewById(R.id.bt_setting);

        mBtStart.setOnClickListener(this);
        mBtStop.setOnClickListener(this);
        mBtSetting.setOnClickListener(this);
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        assignViews();
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.bt_start:
                onStartClick();
                break;
            case R.id.bt_stop:
                onStopClick();
                break;
            case R.id.bt_setting:
                onSettingClick();
                break;
        }
    }

    public void onStartClick() {
        Intent intent = new Intent(this, WebService.class);
        startService(intent);
    }

    public void onStopClick() {
        Intent intent = new Intent(this, WebService.class);
        stopService(intent);
    }

    public void onSettingClick() {

    }
}
