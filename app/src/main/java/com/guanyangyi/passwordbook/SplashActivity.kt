package com.guanyangyi.passwordbook

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.Window
import android.view.WindowManager
import androidx.lifecycle.Observer
import com.guanyangyi.passwordbook.activity.SetInitPasswordsActivity
import com.guanyangyi.passwordbook.base.BaseActivity
import com.guanyangyi.passwordbook.base.BaseVM
import com.guanyangyi.passwordbook.utils.IntentUtils
import com.guanyangyi.passwordbook.viewmodel.SplashViewModel

class SplashActivity: BaseActivity<SplashViewModel> () {

    override fun onCreate(savedInstanceState: Bundle?) {
        this.requestWindowFeature(Window.FEATURE_NO_TITLE);
        this.window.setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
            WindowManager.LayoutParams.FLAG_FULLSCREEN);
        super.onCreate(savedInstanceState)
    }

    override fun getLayoutId(): Int = R.layout.activity_splash

    override fun initViewModel(): SplashViewModel = SplashViewModel()


    override fun initData() {
        mViewModel?.hasSetPasswordLiveData?.observe(this,
            { hasSetPassword ->
                if (hasSetPassword == false){
                   IntentUtils.startActivity(this, Intent(this, SetInitPasswordsActivity::class.java) )
                }
            })
        window.decorView.postDelayed({
            mViewModel?.startQuery()
        }, 1500)
    }

}
