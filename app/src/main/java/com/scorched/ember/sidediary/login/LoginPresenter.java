package com.scorched.ember.sidediary.login;

import android.content.Context;

import com.scorched.ember.sidediary.utils.Navigator;

/**
 * Created by Ember on 14/07/2017.
 */

public class LoginPresenter implements LoginContractor.Presenter {


    private final Context context;
    private final LoginContractor.View mMainView;

    private Navigator navigator;

    public LoginPresenter(Context context, LoginContractor.View mMainView) {
        this.context = context;
        this.mMainView = mMainView;

        mMainView.setPresenter(this);
    }

    @Override
    public void start() {
        if(navigator == null)
            navigator = new Navigator();
    }


    @Override
    public void openDiaries() {
        navigator.navigateToDiaries(context);
    }
}
