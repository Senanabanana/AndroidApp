package com.example.myapplication

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.icu.util.Calendar
import android.os.Build
import android.widget.TimePicker
import androidx.annotation.RequiresApi
import java.sql.Time

class BootReceiver : BroadcastReceiver() {

    @RequiresApi(Build.VERSION_CODES.N)
    override fun onReceive(context: Context, intent: Intent) {
          if (intent.action == "android.intent.action.BOOT_COMPLETED") {
              val calender = Calendar.getInstance()
              val Hour = Calendar.get(Calendar.HOUR)
              val Minute = Calendar.get(Calendar.MINUTE)
              setAlarm(Calendar.timeInMillis)

        }
    }

    private fun setAlarm(timePicker: Time, Hour: Int, Minute: Int) {
        Calendar.set(Calendar.HOUR_OF_DAY, Hour)
        Calendar.set(Calendar.MINUTE, Minute)
        Calendar.set(Calendar.SECOND, 0)
        startAlarm(Calendar)
    }

    private fun startAlarm(calendar: Any) {
        setAlarm()
        TODO("Not yet implemented")
    }
}
