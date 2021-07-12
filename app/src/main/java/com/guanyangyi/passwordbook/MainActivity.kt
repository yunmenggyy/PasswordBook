package com.guanyangyi.passwordbook

import com.guanyangyi.passwordbook.base.BaseActivity
import com.guanyangyi.passwordbook.base.BaseVM

class MainActivity : BaseActivity<BaseVM>() {


    override fun getLayoutId(): Int = R.layout.activity_main

    override fun initData() {

    }

    override fun initViewModel(): BaseVM? {
        return null
    }
}