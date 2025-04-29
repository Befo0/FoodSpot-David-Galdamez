package com.pdmtaller2.DavidGaldamez_00301925.ui.theme.Screens

import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateListOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.pdmtaller2.DavidGaldamez_00301925.ui.theme.Components.ListRestaurants
import com.pdmtaller2.DavidGaldamez_00301925.ui.theme.Data.restaurants

@Composable
fun ListOfRestaurants(){
    val categorias = remember {
        mutableStateListOf("Mexicana", "Pizza", "Italiana" , "Postres")
    }
    LazyColumn(
        modifier = Modifier.fillMaxSize()
    ) {
        items(categorias.toList()) { categoria ->

            val restaurantsList = restaurants.filter { it.categories.contains(categoria) }

            Text(text = categoria)
            Spacer(modifier = Modifier.height(8.dp))
            ListRestaurants(restaurantsList)
        }
    }
}

@Preview(showBackground = true)
@Composable
fun LisOfRestaurantsPreview(){
    ListOfRestaurants()
}