package com.example.projectjson

import android.app.ProgressDialog
import android.os.Build
import android.os.Bundle
import android.text.Html
import android.widget.ProgressBar
import android.widget.TextView

import android.widget.Toast

import androidx.appcompat.app.AppCompatActivity


import com.google.android.material.bottomnavigation.BottomNavigationView



class MainActivity : AppCompatActivity() {



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


     //shimmer loader in loading state
        val progressDialog=ProgressDialog(this)
        progressDialog.setMessage("Loading")
        progressDialog.show()


        //Data display through html
        val textView = findViewById<TextView>(R.id.textviewhtml) as TextView

        var content=
                            "<h></h1>\n"+
                            "<body>\n" +
                            "<p>my father cried when I hugged him today...</p>\n"+
                            "<p>thank you MenDoFeel </p>\n" +
                            "</body>\n"

        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.N) {
            textView.setText(Html.fromHtml(content, Html.FROM_HTML_MODE_LEGACY));
        } else
            textView.setText(Html.fromHtml(content));














        }




    }
