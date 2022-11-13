package com.example.myapplication

import android.app.AlarmManager
import android.icu.util.Calendar
import android.media.RingtoneManager
import android.os.Build
import android.os.Bundle
import android.widget.Toast
import androidx.annotation.RequiresApi
import androidx.appcompat.app.AppCompatActivity
import android.content.Context


class MainActivity : AppCompatActivity() {

    @RequiresApi(Build.VERSION_CODES.N)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
//        setAlarmButton.setOnClickListener {
            startAlarm()

        val r = RingtoneManager.getRingtone(applicationContext,RingtoneManager.getDefaultUri(RingtoneManager.TYPE_RINGTONE))
        /*val a = context.getSystemService(Context.ALARM_SERVICE) as? AlarmManager
        val pendingIntent = PendingIntent.getService(context, requestId, intent, PendingIntent.FLAG_NO_CREATE)

        if (pendingIntent != null && alarmManager != null) {
              alarmManager.cancel(pendingIntent)
        }*/



        }

        var hour: Int = 0
        var minute: Int = 0
        var day: Int = 0
        var month: Int = 0
        var year: Int = 0
    /*    val ACTION_DISMISS_ALARM: False = TODO()
        val ACTION_SET_ALARM: False = TODO()
        val ACTION_SHOW_ALARMS: False = TODO()
        val ACTION_SNOOZE_ALARM: False = TODO() */

    }

    @RequiresApi(Build.VERSION_CODES.N)
    private fun startAlarm() {
        var hour: Int = 0
        var minute: Int = 0
        var day: Int = 0
        var month: Int = 0
        var year: Int = 0

        if ((hour == -1) || (minute == -1) || (year == -1) || (month == -1) || (day == -1)) {
            Toast.makeText(null, "Pick time and date", Toast.LENGTH_LONG).show()
            return
        }
        val calendar = Calendar.getInstance()
            calendar[Calendar.SECOND] = 0
            calendar[Calendar.MINUTE] = minute
            calendar[Calendar.HOUR_OF_DAY] = hour
            calendar[Calendar.DAY_OF_MONTH] = day
            calendar[Calendar.MONTH] = month
            calendar[Calendar.YEAR] = year


    }

    private fun timeAlarm(){
        var hours: Int = 0
        var minutes: Int = 0
        var seconds: Int = 0

    }