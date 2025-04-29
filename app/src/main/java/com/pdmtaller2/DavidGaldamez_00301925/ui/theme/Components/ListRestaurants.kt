package com.pdmtaller2.DavidGaldamez_00301925.ui.theme.Components

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import com.pdmtaller2.DavidGaldamez_00301925.ui.theme.Data.Restaurant

@Composable
fun ListRestaurants(restaurants: List<Restaurant>){
    Row(
        modifier = Modifier.fillMaxWidth(),
        verticalAlignment = Alignment.CenterVertically,
    ) {
        LazyRow(
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.SpaceEvenly
        ) {
            items(restaurants){ restaurant ->
                RestaurantCard(restaurant)
            }
        }
    }
}