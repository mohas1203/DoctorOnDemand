package com.example.winhacks

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_dashboard.*
import kotlinx.android.synthetic.main.activity_main.*

class DashboardActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dashboard)

        // Redirects to Covid-19 info page
        covid19Info.setOnClickListener {
            val intent = Intent(this, Covid19InfoActivity::class.java)
            startActivity(intent)
        }

        // Redirects to Covid-19 tracker page
        covidTrackerBtn.setOnClickListener {
            val intent = Intent(this, Covid19TrackerActivity::class.java)
            startActivity(intent)
        }

        // Redirects to Contact a doctor page
        contactDoctorBtn.setOnClickListener {
            val intent = Intent(this, ContactDoctorActivity::class.java)
            startActivity(intent)
        }

        // Redirects to Symptom page
        symptomCheckBtn.setOnClickListener {
            val intent = Intent(this, SymptomActivity::class.java)
            startActivity(intent)
        }

        // Redirects to Things to do page
        thingsToDoBtn.setOnClickListener {
            val intent = Intent(this, ThingsToDoActivity::class.java)
            startActivity(intent)
        }

    }
}
