package dev.practica.cristian_benalcazar_taller.taller

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.KeyboardArrowLeft
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.navigation.NavHostController

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun FrutasScreen(navController: NavHostController) {
    Scaffold(
        topBar = {
            TopAppBar(
                colors = TopAppBarDefaults.topAppBarColors(containerColor = Color.Green),
                title = { Text("Frutas", color = Color.White) },
                navigationIcon = {
                    IconButton(onClick = { navController.popBackStack() }) {
                        Icon(imageVector = Icons.Default.KeyboardArrowLeft, contentDescription = "Back")
                    }
                }
            )
        }
    ) { paddingValues ->
        Column(
            modifier = Modifier
                .padding(paddingValues)
                .fillMaxSize(),
            verticalArrangement = Arrangement.Top,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            // Reutilizamos la función ItemCoche para mostrar las frutas
            ItemTabla(name = "Manzana", function = "Rojo")
            ItemTabla(name = "Plátano", function = "Amarillo")
            ItemTabla(name = "Naranja", function = "Naranja")
            ItemTabla(name = "Uva", function = "Morado")
            ItemTabla(name = "Sandía", function = "Verde y rojo")
            ItemTabla(name = "Kiwi", function = "Verde")
            ItemTabla(name = "Piña", function = "Amarillo")
            ItemTabla(name = "Fresa", function = "Rojo")
            ItemTabla(name = "Mango", function = "Amarillo")
            ItemTabla(name = "Pera", function = "Verde")
        }
    }
}
