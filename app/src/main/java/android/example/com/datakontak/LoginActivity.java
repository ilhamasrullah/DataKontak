package android.example.com.datakontak;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {

    private EditText etUser;
    private EditText etPassword;
    private Button btnLogin;
    private Button btnRegister;
    private String username;
    private String password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        initView();
        setView();

    }

    private void setView() {
        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                username = etUser.getText().toString();
                password = etPassword.getText().toString();

                if (username.isEmpty() && password.isEmpty()) {
                    Toast.makeText(LoginActivity.this, "Username wajib diisi !!!", Toast.LENGTH_SHORT).show();
                } else {
                    if (username.equals("suneo") && password.equals("1234")){
                        Intent toHome = new Intent(LoginActivity.this,HomeActivity.class);
                        toHome.putExtra("Username",username);
                        startActivity(toHome);
                    }else {
                        Toast.makeText(LoginActivity.this,"Maaf user atau pass salah",Toast.LENGTH_SHORT).show();
                    }
                }
            }
        });
    }

    private void initView() {
        etUser = (EditText) findViewById(R.id.edt_username);
        etPassword = (EditText) findViewById(R.id.edt_password);
        btnLogin = (Button) findViewById(R.id.btn_login);
        btnRegister = (Button) findViewById(R.id.btn_register);

    }
}
