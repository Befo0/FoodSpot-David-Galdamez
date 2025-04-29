package com.pdmtaller2.DavidGaldamez_00301925.ui.theme.Data

val restaurants = listOf<Restaurant>(
    Restaurant(
       id = 1,
        name = "Monterosso",
        description = "Comida italiana que incluye comida libre de gluten!",
        imageUrl = 1,
        categories = listOf("Italiana", "Pizza"),
        menu = listOf(
            Dish(
                id = 1,
                name = "Pizza Napolitana",
                description = "Pizza Clasica",
                imageUrl = "",
            ),
            Dish(
                id = 2,
                name = "Pasta Carbonara",
                description = "Pasta clasica",
                imageUrl = "",
            )
        )
    ),
    Restaurant(
        id = 2,
        name = "Pizza hut",
        description = "Rico restaurante de pizzas y demas comidas!",
        imageUrl = 1,
        categories = listOf("Pizza", "Postres"),
        menu = listOf(
            Dish(
                id = 1,
                name = "Pizza pepperoni",
                description = "Pizza clasica de pepperoni",
                imageUrl = "",
            ),
            Dish(
                id = 2,
                name = "Pizza super suprema",
                description = "Pizza gigante super suprema",
                imageUrl = "",
            )
        )
    ),
    Restaurant(
        id = 3,
        name = "Donkeys",
        description = "Rica comida mexicana",
        imageUrl = 1,
        categories = listOf("Mexicana", "Postres"),
        menu = listOf(
            Dish(
                id = 1,
                name = "Tacos de birria",
                description = "Ricos tacos de birria con su caldo de consome",
                imageUrl = "",
            ),
            Dish(
                id = 2,
                name = "Brownie",
                description = "Postre de brownie",
                imageUrl = "",
            )
        )
    ),
)