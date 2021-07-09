package com.guanyangyi.passwordbook

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Window
import android.view.WindowManager
import com.guanyangyi.passwordbook.base.BaseActivity

class SplashActivity : BaseActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        this.requestWindowFeature(Window.FEATURE_NO_TITLE);
        this.window.setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
            WindowManager.LayoutParams.FLAG_FULLSCREEN);
        super.onCreate(savedInstanceState)
    }
    override fun getLayoutId(): Int = R.layout.activity_splash
}