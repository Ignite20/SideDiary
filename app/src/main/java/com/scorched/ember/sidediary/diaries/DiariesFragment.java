package com.scorched.ember.sidediary.diaries;


import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.scorched.ember.sidediary.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class DiariesFragment extends Fragment implements DiariesContract.View {

    private DiariesContract.Presenter mPresenter;


    public DiariesFragment() {
        // Required empty public constructor
    }

    public static DiariesFragment newInstance(){
        return new DiariesFragment();
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_diaries, container, false);
    }

    @Override
    public void setPresenter(DiariesContract.Presenter presenter) {
        if(presenter != null)
            mPresenter = presenter;
    }
}
