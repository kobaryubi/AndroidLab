package com.masahikokobayashi.androidlab.ui.theme.woof

import androidx.compose.material3.Typography
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import com.masahikokobayashi.androidlab.R

val AbrilFatface = FontFamily(
    Font(R.font.abril_fatface_regular),
)

val Montserrat = FontFamily(
    Font(R.font.montserrat_regular), Font(R.font.montserrat_bold, FontWeight.Bold)
)

val Typography = Typography(
    displayLarge = TextStyle(
        fontFamily = AbrilFatface, fontWeight = FontWeight.Normal, fontSize = 36.sp
    ), displayMedium = TextStyle(
        fontFamily = Montserrat, fontWeight = FontWeight.Bold, fontSize = 20.sp
    ), labelSmall = TextStyle(
        fontFamily = Montserrat, fontWeight = FontWeight.Bold, fontSize = 14.sp
    ), bodyLarge = TextStyle(
        fontFamily = Montserrat, fontWeight = FontWeight.Normal, fontSize = 14.sp
    )
)
