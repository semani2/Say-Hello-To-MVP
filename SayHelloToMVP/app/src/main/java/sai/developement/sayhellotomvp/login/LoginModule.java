package sai.developement.sayhellotomvp.login;

import dagger.Module;
import dagger.Provides;

/**
 * Created by sai on 7/14/17.
 */

@Module
public class LoginModule {

    @Provides
    public LoginMVP.Presenter provideLoginPresenter(LoginMVP.Model model) {
        return new LoginPresenter(model);
    }

    @Provides
    public LoginMVP.Model providesLoginModel(ILoginRepository repository) {
        return new LoginModel(repository);
    }

    @Provides
    public ILoginRepository providesLoginRepository() {
        return new InMemoryRepository();
    }
}
