package com.scorched.ember.sidediary.login;

import com.scorched.ember.sidediary.BasePresenter;
import com.scorched.ember.sidediary.BaseView;

/**
 * Created by Ember on 14/07/2017.
 */

public class LoginContractor {

    public interface View extends BaseView<Presenter> {
        void login();
    }

    public interface Presenter extends BasePresenter {
        void openDiaries();
    }
}
