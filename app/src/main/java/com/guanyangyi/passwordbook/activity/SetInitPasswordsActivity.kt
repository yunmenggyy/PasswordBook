package com.guanyangyi.passwordbook.activity

import android.text.TextUtils
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import com.guanyangyi.passwordbook.R
import com.guanyangyi.passwordbook.base.BaseActivity
import com.guanyangyi.passwordbook.base.BaseVM
import com.guanyangyi.passwordbook.utils.ToastUtil

class SetInitPasswordsActivity: BaseActivity<BaseVM>() {

    var mEditText: EditText? = null

    override fun getLayoutId(): Int = R.layout.activity_set_init_password

    override fun initData() {
        mEditText = findViewById(R.id.id_password_editText)

        findViewById<Button>(R.id.id_sure).setOnClickListener {
            if ( TextUtils.isEmpty(mEditText!!.text) ){
                ToastUtil.showToast(this, "请输入初始密码！！！")
                return@setOnClickListener
            }

            if (mEditText!!.text.length < 6){
                ToastUtil.showToast(this, "密码的长度需要6位！！！")
                return@setOnClickListener
            }
        }
    }

    override fun initViewModel(): BaseVM? = null
}