package com.example.madtlabone;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView txtVwMain;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        this.txtVwMain = findViewById(R.id.txtVwMain);
    }

    public void onBtnClick(View view) {
        this.txtVwMain.setText("The text was changed.");
    }

    @SuppressLint("ResourceAsColor")
    public void onBtnClick2(View view) {
        this.txtVwMain.setTextColor(R.color.purple_200);
    }
}