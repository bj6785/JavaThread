package com.verifone.javathread;

import android.app.Activity;
import android.os.Handler;
import android.os.Message;
import android.util.Log;
import android.widget.Toast;

public class MyHandler extends Handler{

    Activity mActivity = null;
    public MyHandler(Activity activity) {
        this.mActivity = activity;
    }

    @Override
    public void handleMessage(Message msg) {
        Log.d("TAG", "thread:" + Thread.currentThread().getId());
        Toast.makeText(mActivity, "" + msg.what, Toast.LENGTH_SHORT).show();
    }

}
