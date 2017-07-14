package sai.developement.sayhellotomvp.login;

import android.support.annotation.Nullable;

/**
 * Created by sai on 7/14/17.
 */

public class LoginPresenter implements LoginMVP.Presenter {

    @Nullable
    LoginMVP.View view;

    LoginMVP.Model model;

    public LoginPresenter(LoginMVP.Model model) {
        this.model = model;
    }

    @Override
    public void setView(LoginMVP.View view) {
        this.view = view;
    }

    @Override
    public void loginButtonClicked() {
       if(view == null) {
           return;
       }

       // Do validation
        if(view.getFirstName().trim().equals("") || view.getPassword().trim().equals("")) {
            view.showMessageToUser("Please enter details");
        }
        model.saveUser(new User(view.getFirstName(), view.getPassword()));
        view.showMessageToUser("User saved!");
    }

    @Override
    public void loadCurrentUser() {
        if(null == view) {
            return;
        }

        User user = model.getUser();
        if(null != view) {
            view.setFirstName(user.getName());
            view.setPassword(user.getPassword());
        }
    }
}
