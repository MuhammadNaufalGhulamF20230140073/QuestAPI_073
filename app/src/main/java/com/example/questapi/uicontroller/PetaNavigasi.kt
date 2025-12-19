package com.example.questapi.uicontroller

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavController
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.questapi.uicontroller.route.DestinasiEntry
import com.example.questapi.uicontroller.route.DestinasiHome
import com.example.questapi.view.EntrySiswaScreen
import com.example.questapi.view.HomeScreen

@Composable
fun DataSiswaApp(navController: NavHostController = rememberNavController(),
                 modifier: Modifier = Modifier){
    HostNavigasi(navController = navController)
}