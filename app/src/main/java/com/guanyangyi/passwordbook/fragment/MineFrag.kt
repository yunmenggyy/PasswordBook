package com.guanyangyi.passwordbook.fragment

import android.content.Context
import com.guanyangyi.passwordbook.R
import com.guanyangyi.passwordbook.base.BaseFrag
import com.guanyangyi.passwordbook.viewmodel.MineFragViewModel

class MineFrag: BaseFrag<MineFragViewModel>() {
    override fun getLayoutId(): Int {
        return R.layout.frag_mine
    }

    override fun initData() {
    }

    override fun initView() {
    }

    override fun initViewModel(): MineFragViewModel? {
        return MineFragViewModel()
    }
}