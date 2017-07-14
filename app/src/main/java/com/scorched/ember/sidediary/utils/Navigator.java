package com.scorched.ember.sidediary.utils;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;

import com.scorched.ember.sidediary.diaries.DiariesActivity;

/**
 * Created by Ember on 14/07/2017.
 */

public class Navigator {

    private static Intent intent;

    public Navigator(){}

    public void navigateToDiaries(Context context){
        intent = new Intent(context, DiariesActivity.class);
        context.startActivity(intent);

    }
}
