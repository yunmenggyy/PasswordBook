package com.guanyangyi.passwordbook

import android.content.Context
import android.os.Bundle
import android.view.MenuItem
import android.view.View
import android.widget.TextView
import androidx.appcompat.widget.Toolbar
import com.guanyangyi.passwordbook.base.BaseActivity
import com.guanyangyi.passwordbook.base.BaseVM
import com.guanyangyi.passwordbook.utils.ToastUtil
import com.guanyangyi.passwordbook.viewmodel.MainViewModel
import org.w3c.dom.Text

class MainActivity : BaseActivity<MainViewModel>() {

    private var mHomeTab: TextView? = null
    private var mMineTab: TextView? = null

    private val myTabClickListener = View.OnClickListener { v ->
        if (true == v.tag){
            return@OnClickListener
        }
        v.tag = true
        when(v?.id){
            R.id.tab_home ->{
                mMineTab?.tag = false
            }

            R.id.tab_mine ->{
                mHomeTab?.tag = false
            }
        }
    }


    override fun getLayoutId(): Int = R.layout.activity_main

    override fun initViewModel(): MainViewModel? = MainViewModel()

    override fun initView() {
        mHomeTab = findViewById(R.id.tab_home)
        mMineTab = findViewById(R.id.tab_mine)
        mHomeTab?.setOnClickListener(myTabClickListener)
        mMineTab?.setOnClickListener(myTabClickListener)

        //初始化toolBar
        val toolbar = findViewById<Toolbar>(R.id.toolbar)
        toolbar.overflowIcon = resources.getDrawable(android.R.drawable.ic_menu_add,null);
        toolbar.inflateMenu(R.menu.toolbar_menu);
        toolbar.setOnMenuItemClickListener { item ->
            when (item?.itemId) {
                R.id.add_new -> {
                    ToastUtil.showToast(this, "正在努力中")
                }

                R.id.search -> {
                    ToastUtil.showToast(this, "正在努力中")
                }
            }
            false;
        };

    }

    override fun initData() {

    }


}