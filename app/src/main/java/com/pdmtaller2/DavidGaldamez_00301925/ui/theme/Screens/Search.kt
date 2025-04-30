package com.pdmtaller2.DavidGaldamez_00301925.ui.theme.Screens

import android.annotation.SuppressLint
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.pdmtaller2.DavidGaldamez_00301925.ui.theme.Components.RestaurantSearchedCard
import com.pdmtaller2.DavidGaldamez_00301925.ui.theme.Data.Restaurant
import com.pdmtaller2.DavidGaldamez_00301925.ui.theme.Data.restaurants

@SuppressLint("RememberReturnType")
@Composable
fun SearchScreen(onRestaurantCardClick: (Int) -> Unit){
    var searchField = remember {
        mutableStateOf("")
    }
    val filteredRestaurants: List<Restaurant>? = remember(searchField.value) {
        val searchString = searchField.value.trim()
        if(searchField.value.isBlank()){
            null
        } else {
            restaurants.filter { restaurant ->
                restaurant.name.contains(searchString, ignoreCase = true) ||
                        restaurant.menu.any{dish -> dish.name.contains(searchString, ignoreCase = true)} ||
                        restaurant.categories.any{categorie -> categorie.contains(searchString, ignoreCase = true)}
            }
        }
    }

    Column(
        modifier = Modifier.fillMaxSize().padding(24.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(text = "Pantalla de Busqueda", fontWeight = FontWeight.Bold, fontSize = 30.sp)

        Spacer(modifier = Modifier.height(20.dp))

        TextField(
            modifier = Modifier.fillMaxWidth(),
            value = searchField.value,
            singleLine = true,
            onValueChange = {searchField.value = it},
            label = { Text(text = "Buscar restaurante o comida") },
        )

        Spacer(modifier = Modifier.height(20.dp))

        Column(
            modifier = Modifier.fillMaxSize(),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            if(filteredRestaurants == null){
                Text(
                    text = "No se han encontrado resultados",
                    fontWeight = FontWeight.Bold,
                    fontSize = 20.sp)
                return
            }
            filteredRestaurants.forEach{restaurant ->
                Row(
                    modifier = Modifier.fillMaxWidth()
                ) {
                    RestaurantSearchedCard(restaurant, onRestaurantCardClick )
                }
            }
        }
    }
}