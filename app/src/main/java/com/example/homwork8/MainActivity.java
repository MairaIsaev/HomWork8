package com.example.homwork8;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.util.HashMap;
import java.util.Map;

public class MainActivity extends AppCompatActivity {
    private EditText et_sign_in_text;
    private EditText et_sign_in;
    private Button et_sign_in_text1;
    private Map<String, String> signInInfo = new HashMap<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        signInInfo.put("админ123", "admin@gmail.com");

        et_sign_in_text = this.findViewById(R.id.et_sign_in_text);
        et_sign_in = this.findViewById(R.id.et_sign_in);
        et_sign_in_text1 = this.findViewById(R.id.et_sign_in_text1);

            signIn();
    }
        private void signIn() {
        et_sign_in_text1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String et_sing_in_text = et_sign_in_text.getText().toString().trim();
                String et_sign_ini = et_sign_in.getText().toString().trim();

                if (signInInfo.containsKey(et_sign_ini) && signInInfo.containsValue(et_sing_in_text)){
                    Toast.makeText(MainActivity.this, "Вход выполнен успешно", Toast.LENGTH_SHORT).show();
                    signInInfo();
                }else {
                    Toast.makeText(MainActivity.this, "Неверный email или пароль", Toast.LENGTH_SHORT).show();
                }
            }
        });
        }

    private void signInInfo() {
        Intent signUpIntent = new Intent(MainActivity.this, SecondActivity.class);
        startActivity(signUpIntent);
    }


}