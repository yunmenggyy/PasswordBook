package com.guanyangyi.passwordbook.viewmodel

import androidx.lifecycle.MutableLiveData
import com.guanyangyi.passwordbook.base.BaseVM
import com.guanyangyi.passwordbook.utils.Constants.HAS_SET_INIT_PASSWORD
import com.guanyangyi.passwordbook.utils.MmkvUtils

class SplashViewModel: BaseVM() {

    var hasSetPasswordLiveData : MutableLiveData<Boolean> = MutableLiveData()

    fun startQuery() {
        hasSetPasswordLiveData.value = MmkvUtils.mmkv.decodeBool(HAS_SET_INIT_PASSWORD, false)
    }

}