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
fun CochesScreen(navController: NavHostController) {
    Scaffold(
        topBar = {
            TopAppBar(
                colors = TopAppBarDefaults.topAppBarColors(containerColor = Color.Green),
                title = { Text("Coches", color = Color.White) },
                navigationIcon = {
                    IconButton(onClick = { navController.popBackStack() }) {
                        Icon(imageVector = Icons.Default.KeyboardArrowLeft, contentDescription = "Back")
                    }
                }
            )
        }
    ) { paddingValues ->
        Column(
            modifier = Modifier.padding(paddingValues).fillMaxSize(),
            verticalArrangement = Arrangement.Top,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            ItemTabla(name = "Toyota Corolla", function = "Sedán familiar")
            ItemTabla(name = "Honda Civic", function = "Sedán deportivo")
            ItemTabla(name = "Ford Mustang", function = "Coche deportivo")
            ItemTabla(name = "Chevrolet Camaro", function = "Coche deportivo")
            ItemTabla(name = "BMW 3 Series", function = "Sedán de lujo")
            ItemTabla(name = "Audi A4", function = "Sedán ejecutivo")
            ItemTabla(name = "Tesla Model S", function = "Sedán eléctrico")
            ItemTabla(name = "Nissan Leaf", function = "Coche eléctrico")
            ItemTabla(name = "Volkswagen Golf", function = "Hatchback")
            ItemTabla(name = "Mercedes-Benz C-Class", function = "Sedán de lujo")
        }
    }
}
