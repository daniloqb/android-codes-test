package com.example.android.countdown;

import android.os.CountDownTimer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    TextView textView;
    int countdown;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView = (TextView) findViewById(R.id.txtCountdown);

    }

    @Override
    public void onStart(){
        super.onStart();
        countdown = 3;

        CountDownTimer timer = new CountDownTimer(4100,1000) {
            @Override
            public void onTick(long millisUntilFinished) {
                textView.setText(Integer.toString(countdown));
                countdown--;
            }

            @Override
            public void onFinish() {
                textView.setText("");
            }
        }.start();
    }
}
