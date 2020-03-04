package com.paxees;

import android.text.TextUtils;

public class ImplementationClass {
    ResponseListner responseListner;

    public ImplementationClass(ResponseListner responseListner) {
        this.responseListner = responseListner;
    }

    public void isCheck(String email, String pwd) {
        if (TextUtils.isEmpty(email) || TextUtils.isEmpty(pwd)) {
            responseListner.validationError();
        } else {
            if (email.equalsIgnoreCase("zeeshan") && pwd.equalsIgnoreCase("sami")) {
                responseListner.isSuccess();
            } else
                responseListner.isFailure();
        }
    }

    private void onClick(){
        responseListner.onClick(getViewId());
    }

    public int getViewId(){
        //fake view id
        return 123456;
    }
}
