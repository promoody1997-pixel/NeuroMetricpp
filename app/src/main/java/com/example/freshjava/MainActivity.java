package com.example.freshjava;

import android.os.Bundle;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import android.view.Gravity;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // إنشاء واجهة بسيطة بالكود
        TextView tv = new TextView(this);
        tv.setText("مرحباً بك في تطبيق جافا! ☕");
        tv.setTextSize(24f);
        tv.setGravity(Gravity.CENTER);
        
        setContentView(tv);
    }
}
