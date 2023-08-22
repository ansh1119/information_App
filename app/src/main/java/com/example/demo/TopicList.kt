package com.example.demo

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.widget.ImageButton
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.cardview.widget.CardView

class TopicList : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_topic_list)

        val android=findViewById<CardView>(R.id.card1)
        val webdev=findViewById<CardView>(R.id.card2)
        val ML=findViewById<CardView>(R.id.card3)
        val AR=findViewById<CardView>(R.id.card4)
        val IOT=findViewById<CardView>(R.id.card5)
        val other=findViewById<CardView>(R.id.card6)
        val backBtn=findViewById<ImageButton>(R.id.back)
        val call=findViewById<CardView>(R.id.callbtn)


      backBtn.setOnClickListener{
          intent=Intent(applicationContext,MainActivity::class.java)
          startActivity(intent)
      }
//working of android card
        android.setOnClickListener{
            toastMsg("Opening Learner's Guide")
           intent=Intent(Intent.ACTION_VIEW)
            intent.setData(Uri.parse("https://developer.android.com/kotlin"))
            startActivity(intent)
        }

//working of webdev card
        webdev.setOnClickListener{
            toastMsg("Opening Learner's Guide")
            intent=Intent(Intent.ACTION_VIEW)
            intent.setData(Uri.parse("https://www.geeksforgeeks.org/web-development/"))
            startActivity(intent)
        }

//working of ML card
        ML.setOnClickListener{
            toastMsg("Opening Learner's Guide")
            intent = Intent(Intent.ACTION_VIEW)
            intent.setData(Uri.parse("https://scikit-learn.org/stable/"))
            startActivity(intent)
        }

//working of AR card
        AR.setOnClickListener{
            toastMsg("Opening Learner's Guide")
            intent = Intent(Intent.ACTION_VIEW)
            intent.setData(Uri.parse("https://developer.apple.com/design/human-interface-guidelines/augmented-reality"))
            startActivity(intent)
        }

//working of IOT card
        IOT.setOnClickListener{
            toastMsg("Opening Learner's Guide")
            intent=Intent(Intent.ACTION_VIEW)
            intent.setData(Uri.parse("https://docs.iotcreators.com/docs"))
            startActivity(intent)
        }

//working of phone card
        call.setOnClickListener{
            intent=Intent(Intent.ACTION_DIAL)
            intent.setData(Uri.parse("tel:"+8467930517))
            startActivity(intent)
        }

//working of others card
        other.setOnClickListener{
            intent=Intent(applicationContext,topicForm::class.java)
            startActivity(intent)
        }

    }
    fun toastMsg(msg: String?) {
        val toast = Toast.makeText(this, msg, Toast.LENGTH_LONG)
        toast.show()
    }
}