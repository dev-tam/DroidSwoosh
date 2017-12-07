package com.example.jtam.droidswoosh.Controller

import android.content.Intent
//import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.example.jtam.droidswoosh.R
//import android.view.View
import kotlinx.android.synthetic.main.activity_welcome.*

class WelcomeActivity : BaseActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_welcome)

        getStartedBtn.setOnClickListener {
            val leagueIntent = Intent(this, LeagueActivity::class.java)
            startActivity(leagueIntent)
        }
    }


//    fun getStartedClicked(view: View){
//        val startedActivity = Intent(this, LeagueActivity::class.java)
//        startActivity(startedActivity)
//    }
}
