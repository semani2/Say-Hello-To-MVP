package sai.developement.sayhellotomvp.login;

/**
 * Created by sai on 7/14/17.
 */

public class InMemoryRepository implements ILoginRepository {

    private User mUser;

    @Override
    public User getUser() {
        if(mUser == null) {
            mUser = new User("Sai", "helloworld");
            mUser.setId(0);
        }
        return mUser;
    }

    @Override
    public void saveUser(User user) {
        if(user == null) {
            mUser = getUser();
        }
        mUser = user;
    }
}
