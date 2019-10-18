package com.example.dagger2demo.daggerThree.case3;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
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
public class ParkingActivity extends AppCompatActivity {

    @Inject
    Bus bus;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_base);

        BaseApplication.getApplication(this).getParkingComponent().inject(this);

        Toolbar toolbar = findViewById(R.id.toolbar);
        TextView textView = findViewById(R.id.textview);
        toolbar.setTitle("daggerThree case3 ParkingActivity");
        //使用@scope，依赖与容器component有关，component一样则依赖一样
        textView.setText("全局单例 = " + bus.toString());
        textView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setClass(ParkingActivity.this, TestActivity.class);
                startActivity(intent);
            }
        });
    }
}
