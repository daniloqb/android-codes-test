package com.example.android.notification;

import android.app.Activity;
import android.app.NotificationManager;
import android.os.Bundle;

/**
 * Created by user on 22/12/16.
 */

public class NotificationView extends Activity {


    @Override
    public void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);

        setContentView(R.layout.notification);


        NotificationManager nm = (NotificationManager) getSystemService(NOTIFICATION_SERVICE);

       // nm.cancel(getIntent().getExtras().getInt("notificationID"));
          nm.cancel(getIntent().getExtras().getInt("notificationID"));
    }

}
