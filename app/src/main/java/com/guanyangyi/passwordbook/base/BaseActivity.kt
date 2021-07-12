package com.guanyangyi.passwordbook.base

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

abstract class BaseActivity<VM:BaseVM> :AppCompatActivity(){

    protected var mViewModel: VM? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        supportActionBar?.hide()
        setContentView(getLayoutId())
        mViewModel = initViewModel()
        initData()
    }

    /**
     * 获取布局
     * */
    abstract fun getLayoutId(): Int


    abstract fun initData()

    abstract fun initViewModel(): VM?
}