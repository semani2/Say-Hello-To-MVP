package sai.developement.sayhellotomvp.login;

/**
 * Created by sai on 7/14/17.
 */

public class LoginModel implements LoginMVP.Model {

    private ILoginRepository repository;

    public LoginModel(ILoginRepository repository) {
        this.repository = repository;
    }

    @Override
    public User getUser() {
        return repository.getUser();
    }

    @Override
    public void saveUser(User user) {
        repository.saveUser(user);
    }
}
