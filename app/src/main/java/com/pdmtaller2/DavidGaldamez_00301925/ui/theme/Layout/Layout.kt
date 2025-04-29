package com.pdmtaller2.DavidGaldamez_00301925.ui.theme.Layout

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Search
import androidx.compose.material.icons.filled.ShoppingCart
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.pdmtaller2.DavidGaldamez_00301925.ui.theme.Navigation.MyProductsListScreen
import com.pdmtaller2.DavidGaldamez_00301925.ui.theme.Navigation.RestaurantListScreen
import com.pdmtaller2.DavidGaldamez_00301925.ui.theme.Navigation.RestaurantMenuScreen
import com.pdmtaller2.DavidGaldamez_00301925.ui.theme.Navigation.SearchBarScreen
import com.pdmtaller2.DavidGaldamez_00301925.ui.theme.Screens.ListOfRestaurants
import com.pdmtaller2.DavidGaldamez_00301925.ui.theme.Screens.MyProductsScreen
import com.pdmtaller2.DavidGaldamez_00301925.ui.theme.Screens.SearchScreen

@Composable
fun CustomScaffold(){
    val navController = rememberNavController()

    val goToList = {
        navController.navigate(RestaurantListScreen)
    }
    val goToSearch = {
        navController.navigate(SearchBarScreen)
    }
     val goToProducts = {
         navController.navigate(MyProductsListScreen)
     }


    Scaffold(
        topBar = { CustomTopBar()},
        bottomBar = { CustomBottomBar(goToList, goToSearch, goToProducts)},
    ) { innerPadding ->
        Column(
            modifier = Modifier
                .padding(innerPadding)
                .verticalScroll(rememberScrollState()),
        ) {
            NavHost(
                navController = navController,
                startDestination = RestaurantListScreen
            ){
                composable <RestaurantListScreen>{
                    ListOfRestaurants()
                }
                composable <RestaurantMenuScreen>{

                }
                composable <SearchBarScreen>{
                    SearchScreen()
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
fun CustomTopBar(){
    TopAppBar(
        title = { Text(text = "FoodSpot")},
        colors = TopAppBarDefaults.topAppBarColors(
            containerColor = Color.Gray,
            titleContentColor = Color.Black,
            actionIconContentColor = Color.White,
            navigationIconContentColor = Color.Black,),
    )
}

@Composable
fun CustomBottomBar(goToList: () -> Unit, goToSearch: () -> Unit, goToProducts: () -> Unit){
    NavigationBar(
        containerColor = Color.Gray,
        contentColor = Color.Black
    ) {
        NavigationBarItem(
            selected = false,
            onClick = goToList,
            icon = { Icon(imageVector = Icons.Default.Home, contentDescription = "Home" ) },
            label = { Text(text = "Resturantes")}
        )
        NavigationBarItem(
            selected = false,
            onClick = goToSearch,
            icon = { Icon(imageVector = Icons.Default.Search, contentDescription = "Home" ) },
            label = { Text(text = "Buscar")}
        )
        NavigationBarItem(
            selected = false,
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