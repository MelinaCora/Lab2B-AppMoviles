package com.catedra.peliculas

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import com.catedra.peliculas.ui.navigation.AppNavigation
import com.catedra.peliculas.ui.theme.Lab2BTheme

/**
 * Activity contenedora principal.
 * Su única responsabilidad es inicializar el árbol de composables.
 * No modificar este archivo.
 */
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Lab2BTheme {
                AppNavigation()
            }
        }
    }
}
