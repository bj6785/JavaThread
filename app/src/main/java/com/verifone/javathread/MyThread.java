package com.verifone.javathread;

import android.app.Activity;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;

public class MyThread extends Thread {

    Handler mHandler;
    Activity mActivity;

    public MyThread(Activity activity) {
        this.mActivity = activity;
    }

    public Handler getHandler() {
        return mHandler;
    }

    @Override
    public void run() {
        Log.d("TAG", "new thread:" + Thread.currentThread().getId());
        Looper.prepare();
        mHandler = new MyHandler(mActivity);
        Looper.loop();
    }

}
