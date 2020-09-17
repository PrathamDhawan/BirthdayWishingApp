package com.example.birthdaycard

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    }

    fun CreateBirthdayCard(view: View) {

        val name = nameInput.editableText.toString()

        if (nameInput.text.trim().isEmpty())
            Toast.makeText(this, "Name is Required !", Toast.LENGTH_LONG).show()

        else {
            val intent = Intent(this, BirthdayGreeting::class.java)
            intent.putExtra(BirthdayGreeting.name,name)
            startActivity(intent)
        }
    }
}


