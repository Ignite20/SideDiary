package com.scorched.ember.sidediary.diaries;

import android.app.Activity;
import android.os.Bundle;

import com.scorched.ember.sidediary.R;
import com.scorched.ember.sidediary.utils.ActivityUtils;

public class DiariesActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_diaries);

        DiariesFragment diariesFragment = (DiariesFragment)getFragmentManager().findFragmentById(R.id.fragmentContainer);
        if(diariesFragment == null)
            diariesFragment = DiariesFragment.newInstance();

        ActivityUtils.addFragmentToActivity(getFragmentManager(),diariesFragment,R.id.fragmentContainer);

        new DiariesPresenter(this,diariesFragment);
    }
}
