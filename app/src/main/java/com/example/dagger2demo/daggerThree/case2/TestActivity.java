package com.example.dagger2demo.daggerThree.case2;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

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
public class TestActivity extends AppCompatActivity {

    TextView textView;

    @Inject
    User user;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_base);

        Toolbar toolbar = findViewById(R.id.toolbar);
        Button button = findViewById(R.id.btn);
        textView = findViewById(R.id.textview);
        toolbar.setTitle("daggerThree case2 TestActivity");

        button.setVisibility(View.VISIBLE);
        button.setText("退出登录");
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                BaseApplication.getApplication(TestActivity.this).releaseUserComponent();
                finish();
            }
        });
    }

    @Override
    protected void onResume() {
        super.onResume();
        UserComponent userComponent = BaseApplication.getApplication(this).getUserComponent();
        if (userComponent != null) {
            userComponent.inject(this);
            textView.setText("登陆成功了 = " + user.toString());
        }
    }
}
