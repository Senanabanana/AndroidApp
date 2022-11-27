package com.example.myapplication

import android.app.AlarmManager
import android.app.DownloadManager.Request
import android.app.PendingIntent
import android.icu.util.Calendar
import android.media.RingtoneManager
import android.os.Build
import android.os.Bundle
import androidx.annotation.RequiresApi
import androidx.appcompat.app.AppCompatActivity
import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import androidx.core.content.ContextCompat.getSystemService
import android.location.Location
import kotlin.coroutines.jvm.internal.CompletedContinuation.context
import android.view.View
import android.widget.Toast
import android.widget.TimePicker
import android.widget.Button
import android.widget.TextView
import androidx.core.app.AlarmManagerCompat.setAlarmClock
import kotlin.coroutines.cancellation.CancellationException

class MainActivity : AppCompatActivity() {

    @RequiresApi(Build.VERSION_CODES.N)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
//        setAlarmButton.setOnClickListener {
//            startAlarm()
        val r = RingtoneManager.getRingtone(applicationContext, RingtoneManager.getDefaultUri(RingtoneManager.TYPE_RINGTONE)
        )
        val calendar: Calendar = Calendar.getInstance()
            calendar.set(
                calendar.get(Calendar.YEAR),
                calendar.get(Calendar.MONTH),
                calendar.get(Calendar.DAY_OF_MONTH),
                TimePicker(Int: hour),
                TimePicker(Int: minute)
            )


            calendar.time,
            calendar.timeInMillis

        )
    }

    private fun startAlarm(timeInMillis: Long) {
        setAlarmClock(Calendar.timeInMillis)
    }

    private fun setAlarmClock(timeInMillis: AlarmManager) {
        startAlarm(calendar.timeInMillis)
        alarmManager.setRepeating()

    }

}

    /*val a = context.getSystemService(Context.ALARM_SERVICE) as? AlarmManager
        val pendingIntent = PendingIntent.getService(context, requestId, intent, PendingIntent.FLAG_NO_CREATE)

        if (pendingIntent != null && alarmManager != null) {
              alarmManager.cancel(pendingIntent)
        }*/

        var hour: Int = 0
        var minute: Int = 0
        var day: Int = 0
        var month: Int = 0
        var year: Int = 0
        /*val ACTION_DISMISS_ALARM: False =
        val ACTION_SET_ALARM: False =
        val ACTION_SHOW_ALARMS: False
        val ACTION_SNOOZE_ALARM: False*/

    }

    private class Alarm : BroadcastReceiver(){
        override fun onReceive(p0: Context?, p1: Intent?) {
            TODO("Not yet implemented")
        }
            Log.("Alarm has gone off")

    }

    private fun stopAlarm(){
        val alarmManager = Context.getSystemService(Context.ALARM_SERVICE) as? AlarmManager
        val intent: Intent
        val requestId: Request
        val pendingIntent = PendingIntent.getService(context, requestId, intent, PendingIntent.FLAG_NO_CREATE)
        if (pendingIntent != null && alarmManager != null) {
            alarmManager.cancel(pendingIntent)

            }
    }

    fun alarmAlert(view: View){
          val builder = AlertDialog.Builder(this)
          with(builder)
        {
            setTitle("Androidly Alert")
            setMessage("We have a message")
            setPositiveButton("Yes", DialogInterface.OnClickListener(function = buttonClick))
            setNegativeButton(android.R.string.no, negativeButtonClick)
            setNeutralButton("Neutral", neutralButtonClick)
            show()
        }



    }