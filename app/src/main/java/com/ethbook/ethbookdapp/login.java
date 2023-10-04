package com.ethbook.ethbookdapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;
import androidx.appcompat.widget.AppCompatEditText;

import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.ethbook.ethbookdapp.services.Validator;

import org.w3c.dom.Text;

import java.util.logging.Logger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class login extends AppCompatActivity {
    private AppCompatEditText usernameEditText;
    private AppCompatEditText password;
    private Logger logger;
    private AppCompatButton loginBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        this.usernameEditText = findViewById(R.id.username);
        this.password = findViewById(R.id.password);
        this.loginBtn = findViewById(R.id.login_btn);
        this.logger = Logger.getLogger("Login_activity");

        this.logger.info("Hello world this is a test logger.");

//        this.loginBtn.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                System.out.println("Hello world this is the onclick listenner currently responding " +
//                        "on the lick of the login button.");
//            }
//        });


        this.usernameEditText.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

            }

            @Override
            public void afterTextChanged(Editable s) {


                if (s.toString().trim().length() > 0) {
                    if (Validator.isUserNameValid(usernameEditText.getText().toString()) == false) {
                        logger.info("Sorry username invalid");
                    }

                    logger.info("The value of your current user name is : "+usernameEditText.getText());
                }
            }
        });

        this.loginBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                logger.info("You clicked on the button");
            }
        });

    }
}