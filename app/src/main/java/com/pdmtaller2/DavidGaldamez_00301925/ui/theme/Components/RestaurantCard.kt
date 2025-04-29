package com.pdmtaller2.DavidGaldamez_00301925.ui.theme.Components

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.pdmtaller2.DavidGaldamez_00301925.ui.theme.Data.Restaurant

@Composable
fun RestaurantCard(restaurant: Restaurant){
    Box(
        modifier = Modifier.fillMaxHeight(),
    )  {
        Image(painter = painterResource(restaurant.imageUrl),
            contentDescription = restaurant.name,
            contentScale = ContentScale.Crop,
            modifier = Modifier.fillMaxSize()
            )
        Spacer(modifier = Modifier.height(7.dp))
        Text(text = restaurant.name)
    }
}
