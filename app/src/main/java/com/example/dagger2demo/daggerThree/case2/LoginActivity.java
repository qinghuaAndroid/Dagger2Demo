package com.example.dagger2demo.daggerThree.case2;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.dagger2demo.BaseApplication;
import com.example.dagger2demo.R;

import javax.inject.Inject;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

/**
 * Description:
 * Created by FQH on 2019/10/17.
 */
public class LoginActivity extends AppCompatActivity {

    EditText editText;

    @Inject
    User user;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_base);

        Toolbar toolbar = findViewById(R.id.toolbar);
        editText = findViewById(R.id.editText);
        editText.setVisibility(View.VISIBLE);
        Button button = findViewById(R.id.btn);
        button.setVisibility(View.VISIBLE);
        toolbar.setTitle("daggerThree case2 LoginActivity");

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String name = editText.getText().toString().trim();//"野結びの着物"
                if (TextUtils.isEmpty(name)) {
                    Toast.makeText(LoginActivity.this, "客官不可以！", Toast.LENGTH_SHORT).show();
                } else {
                    if (BaseApplication.getApplication(LoginActivity.this).getUserComponent() == null) {
                        BaseApplication.getApplication(LoginActivity.this).initUserComponent(name);
                    }
                    Intent intent = new Intent();
                    intent.setClass(LoginActivity.this, TestActivity.class);
                    startActivity(intent);
                }
            }
        });
    }
}
