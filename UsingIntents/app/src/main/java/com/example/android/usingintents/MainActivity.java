package com.example.android.usingintents;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    int request_code = 1;
    int third_code = 3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);





    }



    public void onClick(View view){
        startActivityForResult(new Intent(".SecondActivity"),request_code);

    }


    public void onClickBtn2(View view){
        Intent intent = new Intent(this,ThirdActivity.class);

        intent.putExtra("age1",25);
        intent.putExtra("str1", "some text.");

        Bundle bundle = new Bundle();

        bundle.putInt("age2",36);
        bundle.putString("str2","Bunble string");

        intent.putExtras(bundle);

        startActivityForResult(intent,third_code);
    }




    public void onActivityResult(int requestCode, int resultCode, Intent data){

        if(requestCode == request_code){
            if(resultCode == RESULT_OK){
                Toast.makeText(this,data.getData().toString(),Toast.LENGTH_SHORT).show();
            }
        }
        else if(requestCode == third_code){
            if(resultCode == RESULT_OK){


                Toast.makeText(this,Integer.toString(data.getIntExtra("age",0)),Toast.LENGTH_SHORT).show();

                Toast.makeText(this,data.getData().toString(),Toast.LENGTH_SHORT).show();
            }
        }
    }
}
