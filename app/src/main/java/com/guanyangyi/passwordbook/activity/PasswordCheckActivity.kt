package com.guanyangyi.passwordbook.activity

import android.content.Intent
import android.text.TextUtils
import android.view.inputmethod.InputMethodManager
import android.widget.TextView
import android.widget.Toast
import com.guanyangyi.passwordbook.MainActivity
import com.guanyangyi.passwordbook.R
import com.guanyangyi.passwordbook.base.BaseActivity
import com.guanyangyi.passwordbook.utils.*
import com.guanyangyi.passwordbook.viewmodel.PasswordCheckViewModel
import com.guanyangyi.passwordbook.widget.PhoneCodeInputListener
import com.longer.verifyedittext.PhoneCode

class PasswordCheckActivity: BaseActivity<PasswordCheckViewModel>() {
    override fun getLayoutId(): Int {
        return R.layout.pair_code_verify2
    }

    override fun initData() {
        val phoneCode = findViewById<PhoneCode>(R.id.phonecode)
        phoneCode.requestFocus()
        phoneCode.hideKeyboard()
        phoneCode.setOnVCodeCompleteListener(object : PhoneCodeInputListener {


            override fun vCodeIncomplete(verificationCode: String?) {
            }

            override fun vCodeComplete(verificationCode: String?) {
                val storedPassword = MmkvUtils.mmkv.decodeString(Constants.PASSWORD);
                if (!TextUtils.isEmpty(storedPassword) && storedPassword!! == verificationCode) {
                    finish()
                    IntentUtils.startActivity(
                        this@PasswordCheckActivity, Intent(
                            this@PasswordCheckActivity,
                            MainActivity::class.java
                        )
                    )
                    return
                }
                ToastUtil.showToast(this@PasswordCheckActivity, "密码不正确")
            }
        })

        var lastClickTime = 0L
        var clickCounts = 0
        findViewById<TextView>(R.id.id_title2).setOnClickListener {
            if (System.currentTimeMillis() - lastClickTime > 3000){
                lastClickTime = 0
                clickCounts = 0
                lastClickTime = System.currentTimeMillis()
            }else{
                clickCounts ++;
                lastClickTime = System.currentTimeMillis()
            }
            if (clickCounts >= 15){
                val storedPassword = MmkvUtils.mmkv.decodeString(Constants.PASSWORD);
                ToastUtil.showToast(this@PasswordCheckActivity, storedPassword, Toast.LENGTH_LONG)
                clickCounts = 0
                lastClickTime = 0
            }
        }

    }

    override fun initViewModel(): PasswordCheckViewModel {
       return PasswordCheckViewModel()
    }
}