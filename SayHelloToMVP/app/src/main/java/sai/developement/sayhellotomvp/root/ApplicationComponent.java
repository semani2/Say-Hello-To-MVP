package sai.developement.sayhellotomvp.root;

import javax.inject.Singleton;

import dagger.Component;
import sai.developement.sayhellotomvp.login.LoginActivity;
import sai.developement.sayhellotomvp.login.LoginModule;

/**
 * Created by sai on 7/14/17.
 */
@Singleton
@Component(modules = {ApplicationModule.class, LoginModule.class})
public interface ApplicationComponent {

    void inject(LoginActivity target);
}
