package com.example.dagger2demo.daggerThree.case3;

import android.os.Bundle;
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
    Bus bus;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_base);

        Toolbar toolbar = findViewById(R.id.toolbar);
        textView = findViewById(R.id.textview);
        toolbar.setTitle("daggerThree case3 TestActivity");
    }

    @Override
    protected void onResume() {
        super.onResume();
        ParkingComponent parkingComponent = BaseApplication.getApplication(this).getParkingComponent();
        if (parkingComponent != null) {
            parkingComponent.inject(this);
            textView.setText("全局单例 = " + bus.toString());
        }
    }
}
