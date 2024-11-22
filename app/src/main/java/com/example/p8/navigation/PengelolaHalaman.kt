package com.example.p8.navigation

import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.ui.Modifier
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.rememberNavController
import com.example.p8.model.Mahasiswa
import com.example.p8.ui.viewmodel.MahasiswaViewModel
import com.example.p8.ui.viewmodel.RencanaStudyViewModel

enum class PengelolaHalaman {
    Splash,
    Mahasiswa,
    Matakuliah,
    Tampil
}
@Composable
fun MahasiswaApp(
    modifier: Modifier = Modifier,
    mahasiswaViewModel: MahasiswaViewModel = viewModel(),
    krsViewModel: RencanaStudyViewModel = viewModel(),
    navController: NavHostController = rememberNavController()
) {
    val mahasiswaUiState = mahasiswaViewModel.mahasiswaUiState.collectAsState().value
    NavHost(
        navController = navController,
        startDestination = PengelolaHalaman.Splash.name,
        modifier = Modifier.padding()
    ){

    }
}