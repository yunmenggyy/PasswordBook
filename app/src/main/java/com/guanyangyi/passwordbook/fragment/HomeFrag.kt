package com.guanyangyi.passwordbook.fragment

import android.content.Context
import com.guanyangyi.passwordbook.R
import com.guanyangyi.passwordbook.base.BaseFrag
import com.guanyangyi.passwordbook.viewmodel.HomeFragViewModel

class HomeFrag : BaseFrag<HomeFragViewModel>() {
    override fun getLayoutId(): Int {
        return R.layout.frag_home
    }

    override fun initData() {
    }

    override fun initView() {

    }

    override fun initViewModel(): HomeFragViewModel? {
        return HomeFragViewModel()
    }
}