package com.example.dagger2demo.daggerFour.case2;

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
public class ChildActivity extends AppCompatActivity {

    @Inject
    Child child;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_base);

        FatherComponent fatherComponent
                = DaggerFatherComponent.builder()
                .fatherModule(new FatherModule("剥奪する"))
                .build();
        fatherComponent.buildChildComponent()
                .setChildModule(new ChildModule("波が多い"))
                .build()
                .inject(this);

        Toolbar toolbar = findViewById(R.id.toolbar);
        TextView textView = findViewById(R.id.textview);

        toolbar.setTitle("daggerFour case1 ChildActivity");
        textView.setText(child.toString());
    }
}
