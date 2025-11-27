package com.example.ca

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Button
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.TextToolbar
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.font.FontWeight.Companion.Bold
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import android.R.attr.start
import android.graphics.Color.blue
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Color.Companion.Black
import androidx.compose.ui.unit.sp
import com.example.ca.ui.theme.CATheme

class Aiworkshop : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {
            workshop(
                imgId = R.drawable.img2
            )
        }
    }
}

@Composable
fun workshop(imgId: Int){

    Column(
        modifier = Modifier
            .fillMaxWidth()
            .padding(
                start = 25.dp,
                end = 25.dp,
                top = 60.dp,
                bottom = 25.dp
            ),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {

        Text(
            text = "AI WORKSHOP",
            fontSize = 30.sp,
            fontWeight = FontWeight.Bold,
            modifier = Modifier.padding(top = 12.dp)
        )

        Image(
            painter = painterResource(id = imgId),
            contentDescription = "",
            modifier = Modifier
                .size(120.dp)
                .padding(top = 20.dp)
        )

        Text(
            text = "Name",
            fontSize = 20.sp,
            fontWeight = FontWeight.Bold,
            modifier = Modifier
                .fillMaxWidth()
                .padding(bottom = 5.dp)
                .padding(top = 45.dp)
        )
        var name by remember { mutableStateOf("") }
        TextField(
            value = name,
            onValueChange = {name = it },
            placeholder = { Text("Enter your name") },
            modifier = Modifier
                .fillMaxWidth()
                .padding(bottom = 20.dp)

        )

        Text(
            text = "Registration Number",
            fontSize = 20.sp,
            fontWeight = FontWeight.Bold,
            modifier = Modifier
                .fillMaxWidth()
                .padding(bottom = 5.dp)
        )
        var number by remember { mutableStateOf("") }
       TextField(
            value = number,
            onValueChange = { number = it},
           placeholder = { Text("Enter Registration Number") },
            modifier = Modifier
                .fillMaxWidth()
                .padding(bottom = 20.dp)
        )

        Text(
            text = "Enter Workshop Level",
            fontSize = 20.sp,
            fontWeight = FontWeight.Bold,
            modifier = Modifier
                .fillMaxWidth()
                .padding(bottom = 5.dp)
        )
        var level by remember { mutableStateOf("") }
        TextField(
            value = level,
            onValueChange = { level = it},
            placeholder = { Text("Beginner / Intermediate / Advance") },
            modifier = Modifier
                .fillMaxWidth()
                .padding(bottom = 20.dp)
        )

        Text(
            text = "Enter Workshop Date",
            fontWeight = FontWeight.Bold,
            fontSize = 20.sp,
            modifier = Modifier
                .fillMaxWidth()
                .padding(bottom = 5.dp)
        )
        var date by remember { mutableStateOf("") }
        TextField(
            value = date,
            onValueChange = { date = it},
            placeholder = { Text("Enter Date") },
            modifier = Modifier
                .fillMaxWidth()
                .padding(bottom = 20.dp)

        )

        Button(
            onClick = { },
            modifier = Modifier
                .fillMaxWidth(),

        ) {
            Text("Enroll Now")
        }
    }
}

@Preview(showBackground = true)
@Composable
fun WorkshopFormPreview() {
    workshop(
        imgId = R.drawable.img2
    )
}