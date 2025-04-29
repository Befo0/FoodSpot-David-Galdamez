package com.pdmtaller2.DavidGaldamez_00301925.ui.theme.Screens

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview

@Composable
fun MyProductsScreen(){
    Column(
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(text = "Pantalla de órdenes")
    }
}

@Preview(showBackground = true)
@Composable
fun MyProductsScreenPreview(){
    MyProductsScreen()
}
