package com.guanyangyi.passwordbook.base

import android.content.Context
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

abstract class BaseActivity<VM:BaseVM> :AppCompatActivity(){

    protected var mViewModel: VM? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        supportActionBar?.hide()
        setContentView(getLayoutId())
        mViewModel = initViewModel()
        initView()
        initData()
    }

    /**
     * 获取布局
     * */
    abstract fun getLayoutId(): Int


    abstract fun initData()

    abstract fun initView()

    abstract fun initViewModel(): VM?
}