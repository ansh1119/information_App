package com.example.demo

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import com.google.firebase.database.DataSnapshot
import com.google.firebase.database.DatabaseError
import com.google.firebase.database.DatabaseReference
import com.google.firebase.database.FirebaseDatabase
import com.google.firebase.database.ValueEventListener

class topicForm : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_topic_form)


        var cancelbtn=findViewById<Button>(R.id.button2)
        var submitbtn=findViewById<Button>(R.id.button)

        var name=findViewById<EditText>(R.id.editTextText)
        var mail=findViewById<EditText>(R.id.editTextText2)
        var phone=findViewById<EditText>(R.id.editTextText3)
        var issue=findViewById<EditText>(R.id.editTextText4)

        cancelbtn.setOnClickListener{
            val intent= Intent(applicationContext, MainActivity::class.java )
            startActivity(intent)
        }
        submitbtn.setOnClickListener {
            var n=name.getText().toString()
            var email=mail.getText().toString()
            var p=phone.getText().toString()
            var prob=issue.getText().toString()

            val issuemodel=IssueModel(email,p,prob)

            var issueRef=FirebaseDatabase.getInstance().getReference("Path To Reference").child(n).addValueEventListener(
                object : ValueEventListener {
                    override fun onDataChange(snapshot: DataSnapshot) {
                        var issueRef=FirebaseDatabase.getInstance().getReference("Path To Reference").child(n)
                        issueRef.setValue(issuemodel)
                    }

                    override fun onCancelled(error: DatabaseError) {
                        TODO("Not yet implemented")
                    }

                })
             Toast.makeText(applicationContext, "request submitted", Toast.LENGTH_SHORT).show()
        }
    }
}