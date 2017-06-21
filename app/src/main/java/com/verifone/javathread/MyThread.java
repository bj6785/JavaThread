package com.verifone.javathread;

import android.app.Activity;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.widget.Toast;

public class MyThread extends Thread {

    MyHandler mHandler;
    Activity mActivity;

    public MyThread(Activity activity) {
        this.mActivity = activity;
    }

    public Handler getHandler() {
        return mHandler;
    }

    @Override
    public void run() {
        Looper.prepare();
        Log.d("TAG", "new thread:" + Thread.currentThread().getId());
        mHandler = new MyHandler(mActivity);
        mHandler.post(new Runnable() {
            @Override
            public void run() {
                Toast.makeText(mActivity, "测试", Toast.LENGTH_SHORT).show();
            }
        });
        Looper.loop();
    }

}
