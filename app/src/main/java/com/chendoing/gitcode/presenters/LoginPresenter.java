package com.chendoing.gitcode.presenters;

import com.chendoing.gitcode.data.api.GithubReponse;
import com.chendoing.gitcode.data.api.oauth.AccessToken;
import com.chendoing.gitcode.presenters.views.LoginView;
import com.f2prateek.rx.preferences.Preference;

/**
 * Created by chenDoInG on 16/5/23.
 */
public class LoginPresenter implements Presenter {

    private LoginView view;

    private GithubReponse reponse;

    private final Preference<String> accessToken;

    public LoginPresenter(LoginView view, GithubReponse reponse, Preference<String> accessToken) {
        this.view = view;
        this.reponse = reponse;
        this.accessToken = accessToken;
    }

    public void getAccessToken(String code) {
        reponse.getUserToken(code)
                .subscribe(token -> {
                    accessToken.set(token.getAccessToken());
                    view.showErrorMsg(accessToken.get());
                });
    }

    @Override
    public void onStart() {
    }

    @Override
    public void onStop() {

    }

    @Override
    public void onPause() {

    }

    @Override
    public void onCreate() {

    }

}
