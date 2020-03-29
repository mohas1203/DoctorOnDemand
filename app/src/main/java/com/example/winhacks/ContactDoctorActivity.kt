package com.example.winhacks

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_contact_doctor.*
import kotlinx.android.synthetic.main.activity_dashboard.*

class ContactDoctorActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_contact_doctor)

        // Redirects to Covid-19 info page
        submitBtn.setOnClickListener {
            val intent = Intent(this, SubmittedActivity::class.java)
            startActivity(intent)
        }
    }
}
