package com.pdmtaller2.DavidGaldamez_00301925.ui.theme.Components

import androidx.compose.foundation.horizontalScroll
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.rememberScrollState
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.pdmtaller2.DavidGaldamez_00301925.ui.theme.Data.Restaurant

@Composable
fun ListRestaurants(restaurants: List<Restaurant>, onRestaurantClick: (Int) -> Unit){
    Row(
        modifier = Modifier.fillMaxWidth().height(175.dp).horizontalScroll(rememberScrollState()),
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.SpaceAround,
    ) {
        restaurants.forEach{ restaurant ->
            RestaurantCard(restaurant, onRestaurantClick)
        }
    }
}