package com.pdmtaller2.DavidGaldamez_00301925.ui.theme.Screens

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.pdmtaller2.DavidGaldamez_00301925.ui.theme.Components.ListRestaurants
import com.pdmtaller2.DavidGaldamez_00301925.ui.theme.Data.restaurants

@Composable
fun ListOfRestaurants( onRestaurantClick: (Int) -> Unit = {}) {
    val categorias = listOf<String>("Mexicana", "Rapida", "Italiana" , "Postres")

    Column(modifier = Modifier.fillMaxSize().padding(24.dp)) {
            categorias.forEach { categoria ->

                val restaurantsList = restaurants.filter { it.categories.contains(categoria) }

                Text(text = "Comida " + categoria, fontSize = 20.sp, fontWeight = FontWeight.Bold )
                Spacer(modifier = Modifier.height(24.dp))
                ListRestaurants(restaurants = restaurantsList, onRestaurantClick)
            }
    }
}

@Preview(showBackground = true)
@Composable
fun LisOfRestaurantsPreview(){
    ListOfRestaurants()
}