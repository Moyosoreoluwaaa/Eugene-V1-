package com.example.eugene.ui.components

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.ColorScheme
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Typography
import androidx.compose.material3.darkColorScheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.domain.model.PredictionAccent
import com.example.domain.model.PredictionCategory

object EugeneShapes {
    val card = RoundedCornerShape(20.dp)
    val pill = RoundedCornerShape(999.dp)
    val sheet = RoundedCornerShape(topStart = 20.dp, topEnd = 20.dp)
}

object EugeneColors {
    // Brand Colors (Cosmic Slate theme)
    val Slate50 = Color(0xFFF8FAFC)
    val Slate100 = Color(0xFFF1F5F9)
    val Slate200 = Color(0xFFE2E8F0)
    val Slate300 = Color(0xFFCBD5E1)
    val Slate400 = Color(0xFF94A3B8)
    val Slate600 = Color(0xFF475569)
    val Slate700 = Color(0xFF334155)
    val Slate800 = Color(0xFF1E293B)
    val Slate900 = Color(0xFF0F172A)
    val CosmicDark = Color(0xFF0B0F19)

    // Status Colors (Sage/Orange/Amber only, no red/deep-green)
    val LightSage = Color(0xFF4D7C59)
    val DarkSage = Color(0xFF86B090)
    
    val LightOrange = Color(0xFFD95A2B)
    val DarkOrange = Color(0xFFF58F6B)
    
    val LightAmber = Color(0xFFC29100)
    val DarkAmber = Color(0xFFF0C243)

    // Option Accent Mapping
    fun getAccentColor(accent: PredictionAccent, isDark: Boolean): Color {
        return when (accent) {
            PredictionAccent.SAGE -> if (isDark) DarkSage else LightSage
            PredictionAccent.ORANGE -> if (isDark) DarkOrange else LightOrange
            PredictionAccent.AMBER -> if (isDark) DarkAmber else LightAmber
            PredictionAccent.BLUE -> if (isDark) Color(0xFF7EB0E6) else Color(0xFF2D70B3)
            PredictionAccent.PURPLE -> if (isDark) Color(0xFFC78AD9) else Color(0xFF82359C)
            PredictionAccent.TEAL -> if (isDark) Color(0xFF5FBFB4) else Color(0xFF168A7D)
        }
    }

    // Category Color Mapping (8 categories)
    fun getCategoryColor(category: PredictionCategory, isDark: Boolean): Color {
        return when (category) {
            PredictionCategory.POLITICS -> if (isDark) Color(0xFFE26D5C) else Color(0xFF9E2A2B)
            PredictionCategory.SPORTS -> if (isDark) Color(0xFF8D99AE) else Color(0xFF1D3557)
            PredictionCategory.ECONOMY -> if (isDark) Color(0xFF57C5B6) else Color(0xFF1A5F7A)
            PredictionCategory.CULTURE -> if (isDark) Color(0xFFDDB892) else Color(0xFF7F4F24)
            PredictionCategory.TECHNOLOGY -> if (isDark) Color(0xFF64B5F6) else Color(0xFF1565C0)
            PredictionCategory.BUSINESS -> if (isDark) Color(0xFF81C784) else Color(0xFF2E7D32)
            PredictionCategory.ENTERTAINMENT -> if (isDark) Color(0xFFF06292) else Color(0xFFAD1457)
            PredictionCategory.SCIENCE -> if (isDark) Color(0xFF4DD0E1) else Color(0xFF00838F)
        }
    }
}

private val LightColorScheme = lightColorScheme(
    primary = EugeneColors.Slate800,
    onPrimary = Color.White,
    primaryContainer = EugeneColors.Slate100,
    onPrimaryContainer = EugeneColors.Slate900,
    secondary = EugeneColors.Slate600,
    onSecondary = Color.White,
    secondaryContainer = EugeneColors.Slate200,
    onSecondaryContainer = EugeneColors.Slate800,
    background = EugeneColors.Slate50,
    onBackground = EugeneColors.Slate900,
    surface = Color.White,
    onSurface = EugeneColors.Slate900,
    surfaceVariant = EugeneColors.Slate100,
    onSurfaceVariant = EugeneColors.Slate600,
    outline = EugeneColors.Slate300,
    outlineVariant = EugeneColors.Slate200
)

private val DarkColorScheme = darkColorScheme(
    primary = EugeneColors.Slate100,
    onPrimary = EugeneColors.Slate900,
    primaryContainer = EugeneColors.Slate800,
    onPrimaryContainer = EugeneColors.Slate100,
    secondary = EugeneColors.Slate400,
    onSecondary = EugeneColors.Slate900,
    secondaryContainer = EugeneColors.Slate700,
    onSecondaryContainer = EugeneColors.Slate100,
    background = EugeneColors.CosmicDark,
    onBackground = EugeneColors.Slate100,
    surface = EugeneColors.Slate900,
    onSurface = EugeneColors.Slate100,
    surfaceVariant = EugeneColors.Slate800,
    onSurfaceVariant = EugeneColors.Slate400,
    outline = EugeneColors.Slate600,
    outlineVariant = EugeneColors.Slate700
)

val EugeneTypography = Typography(
    displayLarge = TextStyle(
        fontFamily = FontFamily.SansSerif,
        fontWeight = FontWeight.Bold,
        fontSize = 32.sp,
        lineHeight = 40.sp,
        letterSpacing = (-0.5).sp
    ),
    headlineMedium = TextStyle(
        fontFamily = FontFamily.SansSerif,
        fontWeight = FontWeight.SemiBold,
        fontSize = 20.sp,
        lineHeight = 26.sp,
        letterSpacing = 0.sp
    ),
    titleLarge = TextStyle(
        fontFamily = FontFamily.SansSerif,
        fontWeight = FontWeight.SemiBold,
        fontSize = 18.sp,
        lineHeight = 24.sp,
        letterSpacing = 0.sp
    ),
    bodyLarge = TextStyle(
        fontFamily = FontFamily.SansSerif,
        fontWeight = FontWeight.Normal,
        fontSize = 15.sp,
        lineHeight = 22.sp,
        letterSpacing = 0.15.sp
    ),
    bodyMedium = TextStyle(
        fontFamily = FontFamily.SansSerif,
        fontWeight = FontWeight.Normal,
        fontSize = 14.sp,
        lineHeight = 20.sp,
        letterSpacing = 0.25.sp
    ),
    labelMedium = TextStyle(
        fontFamily = FontFamily.SansSerif,
        fontWeight = FontWeight.Medium,
        fontSize = 12.sp,
        lineHeight = 16.sp,
        letterSpacing = 0.5.sp
    ),
    labelSmall = TextStyle(
        fontFamily = FontFamily.SansSerif,
        fontWeight = FontWeight.Bold,
        fontSize = 11.sp,
        lineHeight = 14.sp,
        letterSpacing = 1.sp
    )
)

@Composable
fun EugeneTheme(
    darkTheme: Boolean = isSystemInDarkTheme(),
    content: @Composable () -> Unit
) {
    val colorScheme = if (darkTheme) DarkColorScheme else LightColorScheme

    MaterialTheme(
        colorScheme = colorScheme,
        typography = EugeneTypography,
        content = content
    )
}
