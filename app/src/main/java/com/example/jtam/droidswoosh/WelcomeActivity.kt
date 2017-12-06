package com.example.jtam.droidswoosh

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class WelcomeActivity : BaseActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_welcome)
    }

    fun getStartedClicked(view: View){
        val startedActivity = Intent(this, LeagueActivity::class.java)
        startActivity(startedActivity)
    }
}
