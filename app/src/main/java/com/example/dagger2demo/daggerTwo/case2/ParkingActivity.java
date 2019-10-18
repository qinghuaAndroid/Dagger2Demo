package com.example.dagger2demo.daggerTwo.case2;

import android.os.Bundle;
import android.widget.TextView;

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
    @Sign(driver = "hello")
    Bus bus;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_base);

        DaggerParkingComponent.create().inject(this);

        Toolbar toolbar = findViewById(R.id.toolbar);
        TextView textView = findViewById(R.id.textview);

        toolbar.setTitle("daggerTwo case2 ParkingActivity");
        textView.setText(bus.toString());
    }
}
