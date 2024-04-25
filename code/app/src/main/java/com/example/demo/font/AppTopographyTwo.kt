package com.example.demo.font

import androidx.compose.runtime.Composable
import androidx.compose.runtime.staticCompositionLocalOf
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import com.example.demo.R


// FONT-GROUP: Serif
val LocalSerifOsfProvider = staticCompositionLocalOf { AppTopographyTwo.Serif.Osf.PrimarySerifOsf() }
object AppTopographyTwo {

    object Serif {

        object Osf {

            val serifOsfRegular = R.font.economist_serif_regular

            object FontSerifOsF {
                val regular: Font = Font(resId = serifOsfRegular, weight = FontWeight.W400)
            }

            object FontFamilySerifOsF {
                val regular: FontFamily = FontFamily(FontSerifOsF.regular)
            }

            data class PrimarySerifOsf(
                val regular: TextStyle = TextStyle(fontFamily = FontFamilySerifOsF.regular)
            )

        }

    }

}


object EconomistTopography {
    // <--------------------- Serif  ------------------>
    val primarySerifOsf: AppTopographyTwo.Serif.Osf.PrimarySerifOsf
        @Composable
        get() = LocalSerifOsfProvider.current

}