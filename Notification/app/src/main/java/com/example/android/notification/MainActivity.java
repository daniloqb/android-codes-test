package com.example.android.notification;

import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.support.v4.app.NotificationCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    int notificationID = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Button button2 = (Button) findViewById(R.id.button2);

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               displayNofitication();
            }
        });


    }

    public void displayNofitication(){
        Intent intent = new Intent(this, NotificationView.class);

        intent.putExtra("notificationID",notificationID);

        PendingIntent pendingIntent = PendingIntent.getActivity(this, 0,intent,0);

        NotificationManager nm = (NotificationManager) getSystemService(NOTIFICATION_SERVICE);
        NotificationCompat.Builder notifBuilder = new NotificationCompat.Builder(this)
                .setSmallIcon(R.mipmap.ic_launcher)
                .setContentTitle("Meeting Reminder")
                .setContentText("Reminder: Starts in 5 minutes")
                .setContentIntent(pendingIntent);

        nm.notify(notificationID, notifBuilder.build());
    }

    public void onClick(View view){
        Intent intent = new Intent(this, NotificationView.class);
        intent.putExtra("notificationID",notificationID);

        startActivity(intent);

    }

    public void imgClick(View v){


        Toast.makeText(this,"Width:" + String.valueOf(v.getWidth()) ,Toast.LENGTH_LONG).show();
    }

}
