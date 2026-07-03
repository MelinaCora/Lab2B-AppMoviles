package com.catedra.peliculas.ui.theme

import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.darkColorScheme
import androidx.compose.material3.dynamicDarkColorScheme
import androidx.compose.material3.dynamicLightColorScheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.platform.LocalContext

private val LightColorScheme = lightColorScheme(
    primary = androidx.compose.ui.graphics.Color(0xFF1565C0),
    onPrimary = androidx.compose.ui.graphics.Color(0xFFFFFFFF),
    primaryContainer = androidx.compose.ui.graphics.Color(0xFFD6E4FF),
    onPrimaryContainer = androidx.compose.ui.graphics.Color(0xFF001945),
    surface = androidx.compose.ui.graphics.Color(0xFFFAFCFF),
    onSurface = androidx.compose.ui.graphics.Color(0xFF1A1C1E),
    surfaceVariant = androidx.compose.ui.graphics.Color(0xFFDFE2EB),
    onSurfaceVariant = androidx.compose.ui.graphics.Color(0xFF43474E),
    error = androidx.compose.ui.graphics.Color(0xFFBA1A1A),
)

/**
 * Tema de la aplicación Lab 2B.
 * Soporta color dinámico en Android 12+ (Material You).
 * No modificar este archivo.
 */
@Composable
fun Lab2BTheme(
    content: @Composable () -> Unit
) {
    MaterialTheme(
        colorScheme = LightColorScheme,
        content = content
    )
}
