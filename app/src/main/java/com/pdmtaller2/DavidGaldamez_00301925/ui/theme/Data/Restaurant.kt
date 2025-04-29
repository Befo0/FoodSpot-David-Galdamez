package com.pdmtaller2.DavidGaldamez_00301925.ui.theme.Data

data class Restaurant(
    val id: Int,
    val name: String,
    val description: String,
    val imageUrl: String,
    val categories: List<String>,
    val menu: List<Dish>
)