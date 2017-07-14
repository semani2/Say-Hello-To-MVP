package sai.developement.sayhellotomvp.login;

/**
 * Created by sai on 7/14/17.
 */

public interface ILoginRepository {

    User getUser();

    void saveUser(User user);
}
