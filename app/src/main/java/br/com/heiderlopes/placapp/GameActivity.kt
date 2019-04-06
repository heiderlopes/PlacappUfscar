package br.com.heiderlopes.placapp

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_game.*

class GameActivity : AppCompatActivity() {

    var goalHome = 0
    var goalAway = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_game)

        tvHome.text = intent.getStringExtra("HOME")
        tvAway.text = intent.getStringExtra("AWAY")


        if(savedInstanceState != null) {
            goalHome = savedInstanceState.getInt("GOALHOME")
            goalAway = savedInstanceState.getInt("GOALAWAY")
        }

        tvGoalHome.text = goalHome.toString()
        tvGoalAway.text = goalAway.toString()



        btGoalHome.setOnClickListener {
            goalHome++
            tvGoalHome.text = goalHome.toString()
        }

        btGoalAway.setOnClickListener {
            goalAway++
            tvGoalAway.text = goalAway.toString()
        }
    }

    override fun onSaveInstanceState(outState: Bundle?) {
        super.onSaveInstanceState(outState)
        outState?.putInt("GOALHOME", goalHome)
        outState?.putInt("GOALAWAY", goalAway)
    }
}








