package com.example.p8.navigation

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
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

}