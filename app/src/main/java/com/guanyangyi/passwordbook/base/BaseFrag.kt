package com.guanyangyi.passwordbook.base

import android.content.Context
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment

abstract class BaseFrag <VM:BaseVM> : Fragment(){

    protected var mViewModel: VM? = null

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(getLayoutId(), container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
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
