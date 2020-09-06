package mobileapptaylors.example.MAD_assignment1;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

public class AlarmBroadcaster extends BroadcastReceiver {

    @Override
    public void onReceive(Context context, Intent intent) {
        createNotification(context);
    }

    public void createNotification(Context context) {
        NotificationTrigger.starNotification(context);
    }

}
