package com.pdmtaller2.DavidGaldamez_00301925.ui.theme.Layout

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Search
import androidx.compose.material.icons.filled.ShoppingCart
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.MutableState
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.pdmtaller2.DavidGaldamez_00301925.ui.theme.Navigation.MyProductsListScreen
import com.pdmtaller2.DavidGaldamez_00301925.ui.theme.Navigation.RestaurantListScreen
import com.pdmtaller2.DavidGaldamez_00301925.ui.theme.Navigation.RestaurantMenuScreen
import com.pdmtaller2.DavidGaldamez_00301925.ui.theme.Navigation.SearchBarScreen
import com.pdmtaller2.DavidGaldamez_00301925.ui.theme.Screens.ListOfRestaurants
import com.pdmtaller2.DavidGaldamez_00301925.ui.theme.Screens.MyProductsScreen
import com.pdmtaller2.DavidGaldamez_00301925.ui.theme.Screens.RestaurantMenu
import com.pdmtaller2.DavidGaldamez_00301925.ui.theme.Screens.SearchScreen

enum class ScreenNames(){
    HOME, RESTAURANT, SEARCH, PRODUCTS, RESTAURANTSEARCHED
}

@Composable
fun CustomScaffold(){
    val navController = rememberNavController()
    var currentScreen = remember{
        mutableStateOf(ScreenNames.HOME)
    }

    val goToList = {
        currentScreen.value = ScreenNames.HOME
        navController.navigate(RestaurantListScreen)
    }
    val goToSearch = {
        currentScreen.value = ScreenNames.SEARCH
        navController.navigate(SearchBarScreen)
    }
     val goToProducts = {
         currentScreen.value = ScreenNames.PRODUCTS
         navController.navigate(MyProductsListScreen)
     }


    Scaffold(
        topBar = { CustomTopBar(navController, currentScreen)},
        bottomBar = { CustomBottomBar(goToList, goToSearch, goToProducts,currentScreen.value)},
    ) { innerPadding ->
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(innerPadding)
                .verticalScroll(rememberScrollState()),
        ) {
            NavHost(
                navController = navController,
                startDestination = RestaurantListScreen
            ){
                composable <RestaurantListScreen>{
                    val onRestaurantClick = { restaurantId: Int ->
                        currentScreen.value = ScreenNames.RESTAURANT
                        navController.navigate(RestaurantMenuScreen(restaurantId))
                    }
                    ListOfRestaurants(onRestaurantClick)
                }
                composable <RestaurantMenuScreen>{ backStackEntry ->
                    val restaurantId = backStackEntry.arguments?.getInt("id") ?: 0
                    RestaurantMenu( restaurantId)
                }
                composable <SearchBarScreen>{
                    val onRestaurantClick = { restaurantId: Int ->
                        currentScreen.value = ScreenNames.RESTAURANTSEARCHED
                        navController.navigate(RestaurantMenuScreen(restaurantId))
                    }
                    SearchScreen(onRestaurantClick)
                }
                composable <MyProductsListScreen>{
                    MyProductsScreen()
                }
            }
        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun CustomTopBar(navController: NavController, currentScreen: MutableState<ScreenNames>){
    TopAppBar(
        title = { Text(text = "FoodSpot")},
        navigationIcon = {
            if (currentScreen.value == ScreenNames.RESTAURANT || currentScreen.value == ScreenNames.RESTAURANTSEARCHED) {
                IconButton(onClick = {
                    if(currentScreen.value == ScreenNames.RESTAURANT){
                        currentScreen.value = ScreenNames.HOME
                    }else if(currentScreen.value == ScreenNames.RESTAURANTSEARCHED){
                        currentScreen.value = ScreenNames.SEARCH
                    }
                    navController.popBackStack()
                }) {
                    Icon(
                        imageVector = Icons.Filled.ArrowBack,
                        contentDescription = "Atras",
                    )
                }
            }
        },
        colors = TopAppBarDefaults.topAppBarColors(
            containerColor = Color(0xFF64c9a7),
            titleContentColor = Color.Black,
            actionIconContentColor = Color.White,
            navigationIconContentColor = Color.Black)
    )
}

@Composable
fun CustomBottomBar(
    goToList: () -> Unit,
    goToSearch: () -> Unit,
    goToProducts: () -> Unit,
    currentScreen: ScreenNames,
){

    NavigationBar(
        containerColor = Color(0xFF64c9a7),
        contentColor = Color.Black
    ) {
        NavigationBarItem(
            selected = if(currentScreen == ScreenNames.HOME)  true else false,
            onClick = goToList,
            icon = { Icon(imageVector = Icons.Default.Home, contentDescription = "Home" ) },
            label = { Text(text = "Resturantes")}
        )
        NavigationBarItem(
            selected = if(currentScreen == ScreenNames.SEARCH)  true else false,
            onClick = goToSearch,
            icon = { Icon(imageVector = Icons.Default.Search, contentDescription = "Home" ) },
            label = { Text(text = "Buscar")}
        )
        NavigationBarItem(
            selected = if(currentScreen == ScreenNames.PRODUCTS)  true else false,
            onClick = goToProducts,
            icon = { Icon(imageVector = Icons.Default.ShoppingCart, contentDescription = "Home" ) },
            label = { Text(text = "Mis Ordenes")}
        )
    }
}

@Preview(showBackground = true)
@Composable
fun CustomScaffoldPreview(){
    CustomScaffold()
}