package sai.developement.sayhellotomvp.login;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import javax.inject.Inject;

import butterknife.BindView;
import butterknife.ButterKnife;
import sai.developement.sayhellotomvp.R;
import sai.developement.sayhellotomvp.root.App;

public class LoginActivity extends AppCompatActivity implements LoginMVP.View{


    @Inject
    LoginMVP.Presenter presenter;

    @BindView(R.id.nameEditText)
    EditText nameEditText;

    @BindView(R.id.passwordEditText)
    EditText passwordEditText;

    @BindView(R.id.loginButton)
    Button loginButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ButterKnife.bind(this);

        ((App) getApplication()).getComponent().inject(this);

        loginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                presenter.loginButtonClicked();
            }
        });
    }

    @Override
    protected void onResume() {
        super.onResume();
        presenter.setView(this);
        presenter.loadCurrentUser();
    }

    @Override
    public String getFirstName() {
        return nameEditText.getText().toString();
    }

    @Override
    public String getPassword() {
        return passwordEditText.getText().toString();
    }

    @Override
    public void showMessageToUser(String msg) {
        Toast.makeText(this, msg, Toast.LENGTH_SHORT).show();
    }

    @Override
    public void setFirstName(String firstName) {
        nameEditText.setText(firstName);
    }

    @Override
    public void setPassword(String password) {
        passwordEditText.setText(password);
    }
}
