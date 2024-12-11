package com.example.mylogin

import android.util.Log
import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.mylogin.R // Import your app's R class
import java.nio.file.WatchEvent
import kotlin.math.log

@Composable

fun LoginScreen() {
    var email by remember {
        mutableStateOf("")
    }

    var password by remember{
        mutableStateOf("")
    }

    Column (
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ){
        Image(
            painter = painterResource(id = R.drawable.a),
            contentDescription = "Login image",
            modifier = Modifier.size(200.dp)

        )
        Text(text = "Welcome Back",
            fontSize = 28.sp,
            fontWeight = FontWeight.Bold
        )

        Spacer(modifier = Modifier.height(15.dp))

        Text(text = "Login to your account")

        Spacer(modifier = Modifier.height(15.dp))

        OutlinedTextField(value = email,
            onValueChange = { email=it },
            label ={Text(text="Email address")} )


        Spacer(modifier = Modifier.height(15.dp))

        OutlinedTextField(value = password,
            onValueChange = { password =it},
            label ={Text(text="Password")},
            visualTransformation = PasswordVisualTransformation()
        )

        Spacer(modifier = Modifier.height(15.dp))

        Button(onClick = {
            Log.i("credential", "email : $email, password : $password")
        }) {
            Text(text = "login")
        }

        Spacer(modifier = Modifier.height(32.dp))

        Text(text = "Forget password",
            modifier = Modifier.clickable{})


        Spacer(modifier = Modifier.height(32.dp))

        Text(text = "or sign in with",
            modifier = Modifier.clickable{})

        Spacer(modifier = Modifier.height(10.dp))

        Row (
            modifier = Modifier.fillMaxWidth().padding(horizontal = 70.dp, vertical = 10.dp),
            horizontalArrangement = Arrangement.SpaceEvenly
        ){
            Image(painter = painterResource(R.drawable.fb),
                contentDescription = "Facebook",
                modifier = Modifier.size(60.dp).clickable{}

            )

            Image(painter = painterResource(R.drawable.insta),
                contentDescription = "Instagram",
                modifier = Modifier.size(60.dp).clickable{}


            )
        }

    }


}
