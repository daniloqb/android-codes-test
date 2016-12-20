package com.example.android.usingintents;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class ThirdActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);

        Toast.makeText(this,getIntent().getStringExtra("str1"),Toast.LENGTH_SHORT).show();

        Toast.makeText(this, Integer.toString(getIntent().getIntExtra("age1",0)),Toast.LENGTH_SHORT).show();


        Bundle bundle = getIntent().getExtras();

        Toast.makeText(this, bundle.getString("str2"),Toast.LENGTH_SHORT).show();

        Toast.makeText(this, Integer.toString(bundle.getInt("age2")),Toast.LENGTH_SHORT).show();
    }


    public void onClick(View view){

        Intent data = new Intent();

        data.putExtra("age",45);

        data.setData(Uri.parse("Passing some data."));

        setResult(RESULT_OK,data);

        finish();

    }
}
