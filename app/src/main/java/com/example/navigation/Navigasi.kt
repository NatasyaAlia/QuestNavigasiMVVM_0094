package com.example.navigation


import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController

// Enum class untuk mendefinisikan nama rute halaman
enum class Navigasi {
    FormulirSaya,
    Detail
}

@Composable
fun DataApp(
    navController: NavHostController = rememberNavController()
) {
    Scaffold { isiRuang ->
        // NavHost ditambahkan untuk melengkapi modifier yang terpotong di gambar
        NavHost(
            navController = navController,
            startDestination = Navigasi.FormulirSaya.name,
            modifier = Modifier.padding(paddingValues = isiRuang)
        ) {
            composable(route = Navigasi.FormulirSaya.name) {
                FormIsian(
                    // pilihanJK = JenisK.map { id -> konteks.resources.getString(id) },
                    onSubmitBtnClick = { // Pastikan ini sama dengan parameter di FormIsian (huruf kecil 'o')
                        navController.navigate(route = Navigasi.Detail.name)
                    }
                )
            }
            composable(route = Navigasi.Detail.name) {
                TampilData(
                    onBackBtnClick = { cancelAndBackToFormulirSaya(navController) }
                )
            }
        }
    }
}

private fun cancelAndBackToFormulirSaya(
    navController: NavHostController
) {
    navController.popBackStack(route = Navigasi.FormulirSaya.name, inclusive = false)
}