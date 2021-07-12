package com.guanyangyi.passwordbook.widget;

import com.longer.verifyedittext.PhoneCode;

public interface PhoneCodeInputListener extends PhoneCode.OnVCodeInputListener {


    @Override
    void vCodeComplete(String verificationCode);

    @Override
    void vCodeIncomplete(String verificationCode);
}
