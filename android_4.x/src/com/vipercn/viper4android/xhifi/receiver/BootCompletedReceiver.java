package com.vipercn.viper4android.xhifi.receiver;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;

import com.vipercn.viper4android.xhifi.service.HeadsetService;

public class BootCompletedReceiver extends BroadcastReceiver
{
    @Override
    public void onReceive(Context context, Intent intent)
    {
    	Log.i("ViPER4Android_XHiFi", "Starting service, reason = BootCompletedReceiver");
        context.startService(new Intent(context, HeadsetService.class));
    }
}
