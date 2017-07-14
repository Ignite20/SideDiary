package com.scorched.ember.sidediary.login;

import android.app.Activity;
import android.os.Bundle;

import com.scorched.ember.sidediary.R;
import com.scorched.ember.sidediary.utils.ActivityUtils;

public class LoginActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        LoginFragment loginFragment = (LoginFragment)getFragmentManager().findFragmentById(R.id.fragmentContainer);

        if(loginFragment == null)
            loginFragment = LoginFragment.newInstance();

        ActivityUtils.addFragmentToActivity(getFragmentManager(),loginFragment,R.id.fragmentContainer);

        new LoginPresenter(this,loginFragment);

    }
}
