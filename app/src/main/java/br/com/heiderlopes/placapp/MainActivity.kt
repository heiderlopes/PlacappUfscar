package br.com.heiderlopes.placapp

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import br.com.heiderlopes.placapp.extensions.value
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btStart.setOnClickListener {
            val nextScreenIntent = Intent(this,
                GameActivity::class.java)

            nextScreenIntent.putExtra("HOME",
                inputHome.value())

            nextScreenIntent.putExtra("AWAY",
                inputAway.value())

            startActivity(nextScreenIntent)
        }
    }
}










