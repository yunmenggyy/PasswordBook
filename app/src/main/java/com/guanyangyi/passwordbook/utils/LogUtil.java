package com.guanyangyi.passwordbook.utils;

import android.util.Log;

import com.guanyangyi.passwordbook.BuildConfig;

public class LogUtil {
    private static final boolean DEBUG = BuildConfig.DEBUG;

    public static void d(String tag, String message){
        Log.d(tag, message);
    }
}
