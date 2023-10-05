package com.example.moagni

import android.content.Intent
import android.os.Bundle
import android.os.Looper
import android.view.View
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.moagni.databinding.ActivitySignInBinding
import com.example.moagni.ui.theme.MoüaGniTheme

class MainActivity : ComponentActivity() {
    private lateinit var binding: ActivitySignInBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MoüaGniTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Greeting("Android")
                }
            }
            android.os.Handler(Looper.getMainLooper()).postDelayed({
                val intent = Intent(this, SignInActivity::class.java)
                startActivity(intent)
                finish()
            },2000)
        }
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
    
}



@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    MoüaGniTheme {
        Greeting("Android")
    }
}