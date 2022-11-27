package com.example.myapplication

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent

class alarmReceiver : BroadcastReceiver() {

    override fun onReceive(context: Context, intent: Intent) {

    showNotification(
        "Your alarm has gone off"
    )
    (context.applicationContext as com.example.myapplication).apply {
      alarmAlert()

    }
  }

    private fun showNotification(
        s: String
    ) {

    }
}