package com.example.firstproject

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.ImageView
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.firstproject.ui.theme.FirstprojectTheme
import kotlin.random.Random

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.layout)

        val rollbutton :Button = findViewById(R.id.button)
        rollbutton.setOnClickListener(){
           rolldice()
        }
        }}

private fun rolldice() {
    val drawable = when (Random.nextInt(6)+ 1){
        1 -> R.drawable.dice_1
        2 -> R.drawable.dice_2
        3 -> R.drawable.dice_3
        4 -> R.drawable.dice_4
        5 -> R.drawable.dice_5
        else -> R.drawable.dice_6
    }
    fun findViewById(diceimage: Int): ImageView {
        return findViewById(R.id.diceimage)
    }

    val diceimage : ImageView = findViewById(R.id.diceimage)
    diceimage.setImageResource(drawable)


}





