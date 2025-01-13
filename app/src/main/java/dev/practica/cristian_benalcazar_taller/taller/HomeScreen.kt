package dev.practica.cristian_benalcazar_taller.taller

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController


@Composable
fun HomeScreen(navController: NavHostController) {
    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Button(
            onClick = { navController.navigate("coches") },
            modifier = Modifier.padding(8.dp)
        ) {
            Text("Ir a Coches")
        }

        Button(
            onClick = { navController.navigate("frutas") },
            modifier = Modifier.padding(8.dp)
        ) {
            Text("Ir a Frutas")
        }
    }
}
