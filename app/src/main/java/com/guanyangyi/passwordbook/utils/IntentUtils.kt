package com.guanyangyi.passwordbook.utils

import android.app.Application
import android.content.Context
import android.content.Intent

object IntentUtils {

    fun startActivity(context: Context, intent: Intent){
        if (context is Application){
            intent.flags = Intent.FLAG_ACTIVITY_NEW_TASK
        }
        context.startActivity(intent)
    }
}