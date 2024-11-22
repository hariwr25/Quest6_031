package com.example.p8.ui.view.screen

import androidx.compose.runtime.Composable
import com.example.p8.model.Mahasiswa
import com.example.p8.model.RencanaStudy

@Composable
fun TampilHasilView(
    mahasiswa: Mahasiswa,
    rencanaStudi: RencanaStudy,
    onBackButtonClicked: () -> Unit
){
