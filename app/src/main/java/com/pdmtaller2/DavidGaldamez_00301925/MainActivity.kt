package com.pdmtaller2.DavidGaldamez_00301925

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.pdmtaller2.DavidGaldamez_00301925.ui.theme.FoodSpotByDGaldamezTheme
import com.pdmtaller2.DavidGaldamez_00301925.ui.theme.Layout.CustomScaffold

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            FoodSpotByDGaldamezTheme {
                CustomScaffold()
            }
        }
    }
}