package com.example.navegacaofluxotela

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.navegacaofluxotela.screens.LoginScreen
import com.example.navegacaofluxotela.screens.MenuScreen
import com.example.navegacaofluxotela.screens.PedidosScreen
import com.example.navegacaofluxotela.screens.PerfilScreen
import com.example.navegacaofluxotela.ui.theme.NavegacaoFluxoTelaTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            NavegacaoFluxoTelaTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    val navController = rememberNavController()
                    NavHost(
                        navController = navController,
                        startDestination = "login"
                    ) {

                        composable(route = "login") {LoginScreen(modifier = Modifier.padding(innerPadding), navController) }

                        composable(route = "menu") {MenuScreen(modifier = Modifier.padding(innerPadding), navController) }

                        composable(route = "pedidos") {PerfilScreen(modifier = Modifier.padding(innerPadding), navController) }

                        composable(route = "perfil") {PedidosScreen(modifier = Modifier.padding(innerPadding), navController) }
                    }

                }
            }
        }
    }
}



