package sai.developement.sayhellotomvp.login;

/**
 * Created by sai on 7/14/17.
 */

public interface LoginMVP {

    interface Model{

        User getUser();

        void saveUser(User user);
    }

    interface View{

        String getFirstName();

        String getPassword();

        void showMessageToUser(String msg);

        void setFirstName(String firstName);

        void setPassword(String password);
    }

    interface Presenter{

        void setView(LoginMVP.View view);

        void loginButtonClicked();

        void loadCurrentUser();
    }
}




