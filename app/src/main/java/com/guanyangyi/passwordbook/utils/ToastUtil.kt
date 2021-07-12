package com.guanyangyi.passwordbook.utils

import android.content.Context
import android.os.Looper
import android.widget.Toast
import java.util.logging.Handler

object ToastUtil {

    private val handler = android.os.Handler(Looper.getMainLooper())
    private var mToast: Toast? = null

    fun showToast(context: Context?, message: String?, length: Int = Toast.LENGTH_SHORT) {
        handler.post {
            if (mToast == null) {
                mToast = Toast.makeText(context, message, length)
            } else {
                mToast!!.setText(message)
            }
            mToast!!.show()
        }
    }
}