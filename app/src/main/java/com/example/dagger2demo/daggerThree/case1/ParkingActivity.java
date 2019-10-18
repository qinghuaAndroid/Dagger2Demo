package com.example.dagger2demo.daggerThree.case1;

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
    Bus bus;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_base);

        ParkingComponent component = DaggerParkingComponent.builder().parkingModule(new ParkingModule("波が多い")).build();

        Toolbar toolbar = findViewById(R.id.toolbar);
        TextView textView = findViewById(R.id.textview);
        TextView textView2 = findViewById(R.id.textview2);
        toolbar.setTitle("daggerThree case1 ParkingActivity");
        //使用@scope，依赖与容器component有关，component一样则依赖一样
        component.inject(this);
        textView.setText(bus.toString());
        component.inject(this);
        textView2.setText(bus.toString());
    }
}
