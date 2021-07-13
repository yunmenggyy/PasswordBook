package com.guanyangyi.passwordbook.viewmodel

import android.app.Activity
import android.content.Context
import android.content.Intent
import com.guanyangyi.passwordbook.MainActivity
import com.guanyangyi.passwordbook.activity.PasswordCheckActivity
import com.guanyangyi.passwordbook.base.BaseVM
import com.guanyangyi.passwordbook.utils.Constants.HAS_SET_INIT_PASSWORD
import com.guanyangyi.passwordbook.utils.Constants.PASSWORD
import com.guanyangyi.passwordbook.utils.Constants.TAG
import com.guanyangyi.passwordbook.utils.IntentUtils
import com.guanyangyi.passwordbook.utils.LogUtil
import com.guanyangyi.passwordbook.utils.MmkvUtils

class SetInitPasswordsViewModel(): BaseVM() {

    fun saveAppPassword(context: Context, passwords: String ){
        val boolean = MmkvUtils.mmkv.encode(HAS_SET_INIT_PASSWORD, true)
        val storeSuccess = MmkvUtils.mmkv.encode(PASSWORD, passwords)
        LogUtil.d(TAG, "saveAppPassword = $boolean")
        LogUtil.d(TAG, "storeSuccess = $storeSuccess")
        (context as Activity).finish()
        IntentUtils.startActivity(context, Intent(context, MainActivity::class.java))
    }
}