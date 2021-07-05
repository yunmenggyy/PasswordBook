package com.guanyangyi.passwordbook.base

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

abstract class BaseActivity :AppCompatActivity(){

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(getLayoutId())
    }

    /**
     * 获取布局
     * */
    abstract fun getLayoutId(): Int
}