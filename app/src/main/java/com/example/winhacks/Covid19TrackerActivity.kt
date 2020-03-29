package com.example.winhacks

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.TextView
import okhttp3.*
import org.json.JSONObject
import java.io.IOException

class Covid19TrackerActivity : AppCompatActivity() {

    private val client = OkHttpClient()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_covid19_tracker)

        run("https://corona.lmao.ninja/all")
    }

    fun run(url: String) {
        val request = Request.Builder()
            .url(url)
            .build()

        client.newCall(request).enqueue(object : Callback {
            override fun onFailure(call: Call, e: IOException) {
                e.printStackTrace()
            }
            override fun onResponse(call: Call, response: Response){
                val data = response.body?.string()
                Log.d("Covid19InfoActivity", data)
                val json_contact: JSONObject = JSONObject(data!!)
                val cases = json_contact.getInt("cases")
                val deaths = json_contact.getInt("deaths")
                val recovered = json_contact.getInt("recovered")
                Log.d("Covid19InfoActivity", cases.toString())

                val casesTV = findViewById<TextView>(R.id.textCases)
                val deathsTV = findViewById<TextView>(R.id.textDeaths)
                val recoveredTV = findViewById<TextView>(R.id.textRecovered)
                casesTV.setText(cases.toString())
                deathsTV.setText(deaths.toString())
                recoveredTV.setText(recovered.toString())
            }

        })
    }
}