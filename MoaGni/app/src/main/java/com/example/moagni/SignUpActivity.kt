package com.example.moagni

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.moagni.databinding.ActivitySignUpBinding

class SignUpActivity : AppCompatActivity() {
    /*private lateinit var binding: ActivitySignUpBinding*/

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sign_up)
        /*binding = ActivitySignUpBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        setListeners()*/
    }

    /*private fun setListeners(){
        binding.textSignIn.setOnClickListener(View.OnClickListener {
            fun onClick(view: View){
                onBackPressed();
            }
        })
    }*/
}