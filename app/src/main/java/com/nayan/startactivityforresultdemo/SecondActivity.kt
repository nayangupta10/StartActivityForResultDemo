package com.nayan.startactivityforresultdemo

import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_second.*

class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        btnSubmit.setOnClickListener {
            val intent = Intent()
            intent.putExtra(MainActivity.NAME, etName.text.toString())
            intent.putExtra(MainActivity.EMAIL, etEmail.text.toString())
            setResult(Activity.RESULT_OK, intent)
            finish()
        }
    }
}