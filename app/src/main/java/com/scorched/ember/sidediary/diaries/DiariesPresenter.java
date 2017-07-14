package com.scorched.ember.sidediary.diaries;

import android.content.Context;

/**
 * Created by Ember on 14/07/2017.
 */

public class DiariesPresenter implements DiariesContract.Presenter {

    private final Context context;
    private final DiariesContract.View mMainView;

    public DiariesPresenter(Context context, DiariesContract.View mMainView) {
        this.context = context;
        this.mMainView = mMainView;
    }

    @Override
    public void start() {

    }
}
