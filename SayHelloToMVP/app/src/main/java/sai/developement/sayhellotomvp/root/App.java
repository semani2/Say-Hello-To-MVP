package sai.developement.sayhellotomvp.root;

import android.app.Application;

import sai.developement.sayhellotomvp.login.LoginModule;

/**
 * Created by sai on 7/14/17.
 */

public class App extends Application {

    private ApplicationComponent component;

    @Override
    public void onCreate() {
        super.onCreate();

        component = DaggerApplicationComponent.builder()
                .applicationModule(new ApplicationModule(this))
                .loginModule(new LoginModule())
                .build();
    }

    public ApplicationComponent getComponent() {
        return component;
    }
}
