package com.example.butterknife_demo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {


    @BindView(R.id.button)
    Button button;
    @BindView(R.id.button1)
    Button button1;
    @BindView(R.id.userName)
    EditText userName;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
    }


    @OnClick({R.id.button, R.id.button1})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.button:


                userName.setText("hello");

                break;
            case R.id.button1:

                break;
        }
    }
}
