package com.example.eugene

import androidx.compose.runtime.Composable
import androidx.compose.material3.Text
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.di.databaseModule
import com.example.di.networkModule
import com.example.di.dataModule
import com.example.di.domainModule
import com.example.di.viewModelModule
import com.example.di.platformModule
import org.koin.compose.KoinApplication
import org.koin.compose.KoinContext

@Composable
fun App() {
    KoinApplication(application = {
        modules(
            databaseModule,
            networkModule,
            dataModule,
            domainModule,
            viewModelModule,
            platformModule
        )
    }) {
        KoinContext {
            val navController = rememberNavController()
            NavHost(
                navController = navController,
                startDestination = "home"
            ) {
                composable("home") {
                    Text("Welcome to Eugene Prediction Market!")
                }
            }
        }
    }
}
