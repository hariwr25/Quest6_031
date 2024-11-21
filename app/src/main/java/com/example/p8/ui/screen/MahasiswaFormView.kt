package com.example.p8.ui.screen

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.p8.R

@Composable
fun MahasiswaFormView(
    modifier: Modifier,
    onSubmitButtonClicked: (MutableList<String> -> Unit,
    onBackButtonClicked: () -> Unit
) {
    var nama by remember {
        mutableStateOf("") }
    var nim by remember {
        mutableStateOf("")
    }
    var email by remember {
        mutableStateOf("")
    }

    val listData: MutableList<String> =
        mutableListOf(nim, nama, email)

    Column (
        modifier = Modifier
            .fillMaxSize()
            .background(
            color = colorResource(
                id = R.color.primary
            )
        ),
        horizontalAlignment = Alignment.CenterHorizontally
    ){
        Spacer(modifier = Modifier.padding(26.dp))
        Row(
            verticalAlignment = Alignment.CenterVertically
        ){
            Image(
                painter = painterResource(id = R.drawable.logoumy),
                contentDescription = "",
                modifier = Modifier.size(45.dp)
            )
            Spacer(modifier = Modifier.padding(16.dp))

            Column{
                Text(text = "Universitas Muhammadiyah Yogyakarta",
                    color = Color.Red,
                    fontSize = 16.sp,
                    fontWeight = FontWeight.Bold
                )

                Text(text = "Unggul dan Islami",
                    color = Color.Red,
                    fontWeight = FontWeight.Light
                )
            }
        }
    }
    Spacer(modifier = Modifier.padding(top = 16.dp,))

    Box(modifier = Modifier.background(
        color = Color.White,
        shape = RoundedCornerShape(
            topEnd = 15.dp,
            topStart = 15.dp
        )
    )
        .fillMaxSize()
    ){
        Column (
            modifier = Modifier
                .fillMaxSize()
        )
    }
}
