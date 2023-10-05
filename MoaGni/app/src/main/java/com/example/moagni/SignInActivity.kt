package com.example.moagni

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import com.example.moagni.databinding.ActivitySignInBinding
import com.google.firebase.firestore.FirebaseFirestore

class SignInActivity : AppCompatActivity() {
    private lateinit var binding: ActivitySignInBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySignInBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        setListeners()
    }

    private fun setListeners(){
        binding.textCreateNewAccount.setOnClickListener(View.OnClickListener {
            startActivity(Intent(applicationContext,SignUpActivity::class.java))
        })
    }

    private fun addDataToFirestore(){
        var database : FirebaseFirestore = FirebaseFirestore.getInstance()
        var data : HashMap<String, String> = HashMap()
        data.put("first_name","Oum");
        data.put("last_name","Nyobe");

        database.collection("users")
            .add(data)
            .addOnSuccessListener {documentReference ->{
                Toast.makeText(applicationContext,"Data Inserted", Toast.LENGTH_SHORT).show();
            } }
            .addOnFailureListener{execption -> {
                Toast.makeText(applicationContext,execption.message,Toast.LENGTH_SHORT).show();
            }}
    }
}