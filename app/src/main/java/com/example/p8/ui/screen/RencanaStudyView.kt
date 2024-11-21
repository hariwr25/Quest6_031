package com.example.p8.ui.screen

import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import com.example.p8.model.Mahasiswa
import com.example.p8.model.RencanaStudy

@Composable
fun RencanaStudyView(
    mahasiswa: Mahasiswa,
    onSubmitButtonClicked: (MutableList<String>) -> Unit,
    onBackButtonClicked: () -> Unit
) {
        var chosenDropDown by remember { mutableStateOf("") }
    var checked by remember { mutableStateOf(false) }
    var pilihanKelas by remember { mutableStateOf("") }
    }