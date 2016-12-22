package com.example.tic.dynamicbuttons;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutCompat;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        LinearLayoutCompat.LayoutParams params =
                new LinearLayoutCompat.LayoutParams(
                        LinearLayoutCompat.LayoutParams.WRAP_CONTENT,
                        LinearLayoutCompat.LayoutParams.WRAP_CONTENT);

        LinearLayout layout = (LinearLayout) findViewById(R.id.activity_main);

        for(int i = 0; i < 5; i++) {
            Button button = new Button(this);
            button.setLayoutParams(params);
            button.setText("Button"+Integer.toString(i));
            button.setId(i);

            button.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    show_text(v);
                }
            });

            layout.addView(button);
        }
    }


    public void show_text(View v){
        Toast.makeText(this, Integer.toString(v.getId()),
                Toast.LENGTH_LONG).show();
    }
}
