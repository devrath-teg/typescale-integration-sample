package com.example.demo.custom

import androidx.compose.foundation.layout.padding
import androidx.compose.material3.LocalTextStyle
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextLayoutResult
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.demo.custom.TextScaleConstants.default_error
import com.example.demo.custom.TextScaleConstants.typeScale_10_displayText
import com.example.demo.custom.TextScaleConstants.typeScale_11_displayText
import com.example.demo.custom.TextScaleConstants.typeScale_12_displayText
import com.example.demo.custom.TextScaleConstants.typeScale_13_displayText
import com.example.demo.custom.TextScaleConstants.typeScale_14_displayText
import com.example.demo.custom.TextScaleConstants.typeScale_1_bodyText
import com.example.demo.custom.TextScaleConstants.typeScale_2_bodyText
import com.example.demo.custom.TextScaleConstants.typeScale_2_displayText
import com.example.demo.custom.TextScaleConstants.typeScale_3_bodyText
import com.example.demo.custom.TextScaleConstants.typeScale_3_displayText
import com.example.demo.custom.TextScaleConstants.typeScale_4_bodyText
import com.example.demo.custom.TextScaleConstants.typeScale_4_displayText
import com.example.demo.custom.TextScaleConstants.typeScale_5_bodyText
import com.example.demo.custom.TextScaleConstants.typeScale_5_displayText
import com.example.demo.custom.TextScaleConstants.typeScale_6_bodyText
import com.example.demo.custom.TextScaleConstants.typeScale_6_displayText
import com.example.demo.custom.TextScaleConstants.typeScale_7_displayText
import com.example.demo.custom.TextScaleConstants.typeScale_8_displayText
import com.example.demo.custom.TextScaleConstants.typeScale_9_displayText

/**
 * ************************************ How to use it ************************************
 *  Ticket: https://economist.atlassian.net/browse/MAWE-1161
 *  Note: scaleVariant can throw error if the variant does not exist
 *
 *  EconomistText(
 *                text = "Economist Text",
 *                typeScaleValue = TypeScaleValue.TypeScale1,
 *                scaleVariant = ScaleVariant.DisplayText
 *  )
 * ************************************ How to use it ************************************
 */
@Composable
fun EconomistText(
    // Compulsory
    text: String,
    typeScaleValue: TypeScaleValue,
    scaleVariant: ScaleVariant,
    // Optional
    modifier: Modifier = Modifier,
    color: Color = Color.Unspecified,
    fontStyle: FontStyle? = null,
    fontWeight: FontWeight? = null,
    fontFamily: FontFamily? = null,
    letterSpacing: TextUnit = TextUnit.Unspecified,
    textDecoration: TextDecoration? = null,
    textAlign: TextAlign? = null,
    overflow: TextOverflow = TextOverflow.Clip,
    softWrap: Boolean = true,
    maxLines: Int = Int.MAX_VALUE,
    minLines: Int = 1,
    onTextLayout: (TextLayoutResult) -> Unit = {},
    style: TextStyle = LocalTextStyle.current,
) {
    return when (typeScaleValue) {
        is TypeScaleValue.TypeScale1 -> when (scaleVariant) {
            ScaleVariant.DisplayText -> {
                throw IllegalArgumentException(default_error)
            }

            ScaleVariant.BodyText -> {
                AppText(
                    // Compulsory
                    text = text, scaleOption = typeScale_1_bodyText,
                    // Optional
                    modifier = modifier,
                    color = color,
                    fontStyle = fontStyle,
                    fontWeight = fontWeight, fontFamily = fontFamily,
                    letterSpacing = letterSpacing, textDecoration = textDecoration,
                    textAlign = textAlign, overflow = overflow, softWrap = softWrap,
                    maxLines = maxLines, minLines = minLines, onTextLayout = onTextLayout,
                    style = style
                )
            }
        }

        is TypeScaleValue.TypeScale2 -> when (scaleVariant) {
            ScaleVariant.DisplayText -> {
                AppText(
                    // Compulsory
                    text = text, scaleOption = typeScale_2_displayText,
                    // Optional
                    modifier = modifier, color = color, fontStyle = fontStyle,
                    fontWeight = fontWeight, fontFamily = fontFamily,
                    letterSpacing = letterSpacing, textDecoration = textDecoration,
                    textAlign = textAlign, overflow = overflow, softWrap = softWrap,
                    maxLines = maxLines, minLines = minLines, onTextLayout = onTextLayout,
                    style = style
                )
            }

            ScaleVariant.BodyText -> {
                AppText(
                    // Compulsory
                    text = text, scaleOption = typeScale_2_bodyText,
                    // Optional
                    modifier = modifier, color = color, fontStyle = fontStyle,
                    fontWeight = fontWeight, fontFamily = fontFamily,
                    letterSpacing = letterSpacing, textDecoration = textDecoration,
                    textAlign = textAlign, overflow = overflow, softWrap = softWrap,
                    maxLines = maxLines, minLines = minLines, onTextLayout = onTextLayout,
                    style = style
                )
            }
        }

        is TypeScaleValue.TypeScale3 -> when (scaleVariant) {
            ScaleVariant.DisplayText -> {
                AppText(
                    // Compulsory
                    text = text, scaleOption = typeScale_3_displayText,
                    // Optional
                    modifier = modifier, color = color, fontStyle = fontStyle,
                    fontWeight = fontWeight, fontFamily = fontFamily,
                    letterSpacing = letterSpacing, textDecoration = textDecoration,
                    textAlign = textAlign, overflow = overflow, softWrap = softWrap,
                    maxLines = maxLines, minLines = minLines, onTextLayout = onTextLayout,
                    style = style
                )
            }

            ScaleVariant.BodyText -> {
                AppText(
                    // Compulsory
                    text = text, scaleOption = typeScale_3_bodyText,
                    // Optional
                    modifier = modifier, color = color, fontStyle = fontStyle,
                    fontWeight = fontWeight, fontFamily = fontFamily,
                    letterSpacing = letterSpacing, textDecoration = textDecoration,
                    textAlign = textAlign, overflow = overflow, softWrap = softWrap,
                    maxLines = maxLines, minLines = minLines, onTextLayout = onTextLayout,
                    style = style
                )
            }
        }

        is TypeScaleValue.TypeScale4 -> when (scaleVariant) {
            ScaleVariant.DisplayText -> {
                AppText(
                    // Compulsory
                    text = text, scaleOption = typeScale_4_displayText,
                    // Optional
                    modifier = modifier, color = color, fontStyle = fontStyle,
                    fontWeight = fontWeight, fontFamily = fontFamily,
                    letterSpacing = letterSpacing, textDecoration = textDecoration,
                    textAlign = textAlign, overflow = overflow, softWrap = softWrap,
                    maxLines = maxLines, minLines = minLines, onTextLayout = onTextLayout,
                    style = style
                )
            }

            ScaleVariant.BodyText -> {
                AppText(
                    // Compulsory
                    text = text, scaleOption = typeScale_4_bodyText,
                    // Optional
                    modifier = modifier, color = color, fontStyle = fontStyle,
                    fontWeight = fontWeight, fontFamily = fontFamily,
                    letterSpacing = letterSpacing, textDecoration = textDecoration,
                    textAlign = textAlign, overflow = overflow, softWrap = softWrap,
                    maxLines = maxLines, minLines = minLines, onTextLayout = onTextLayout,
                    style = style
                )
            }
        }

        is TypeScaleValue.TypeScale5 -> when (scaleVariant) {
            ScaleVariant.DisplayText -> {
                AppText(
                    // Compulsory
                    text = text, scaleOption = typeScale_5_displayText,
                    // Optional
                    modifier = modifier, color = color, fontStyle = fontStyle,
                    fontWeight = fontWeight, fontFamily = fontFamily,
                    letterSpacing = letterSpacing, textDecoration = textDecoration,
                    textAlign = textAlign, overflow = overflow, softWrap = softWrap,
                    maxLines = maxLines, minLines = minLines, onTextLayout = onTextLayout,
                    style = style
                )
            }

            ScaleVariant.BodyText -> {
                AppText(
                    // Compulsory
                    text = text, scaleOption = typeScale_5_bodyText,
                    // Optional
                    modifier = modifier, color = color, fontStyle = fontStyle,
                    fontWeight = fontWeight, fontFamily = fontFamily,
                    letterSpacing = letterSpacing, textDecoration = textDecoration,
                    textAlign = textAlign, overflow = overflow, softWrap = softWrap,
                    maxLines = maxLines, minLines = minLines, onTextLayout = onTextLayout,
                    style = style
                )
            }
        }

        is TypeScaleValue.TypeScale6 -> when (scaleVariant) {
            ScaleVariant.DisplayText -> {
                AppText(
                    // Compulsory
                    text = text, scaleOption = typeScale_6_displayText,
                    // Optional
                    modifier = modifier, color = color, fontStyle = fontStyle,
                    fontWeight = fontWeight, fontFamily = fontFamily,
                    letterSpacing = letterSpacing, textDecoration = textDecoration,
                    textAlign = textAlign, overflow = overflow, softWrap = softWrap,
                    maxLines = maxLines, minLines = minLines, onTextLayout = onTextLayout,
                    style = style
                )
            }

            ScaleVariant.BodyText -> {
                AppText(
                    // Compulsory
                    text = text, scaleOption = typeScale_6_bodyText,
                    // Optional
                    modifier = modifier, color = color, fontStyle = fontStyle,
                    fontWeight = fontWeight, fontFamily = fontFamily,
                    letterSpacing = letterSpacing, textDecoration = textDecoration,
                    textAlign = textAlign, overflow = overflow, softWrap = softWrap,
                    maxLines = maxLines, minLines = minLines, onTextLayout = onTextLayout,
                    style = style
                )
            }
        }

        is TypeScaleValue.TypeScale7 -> when (scaleVariant) {
            ScaleVariant.DisplayText -> {
                AppText(
                    // Compulsory
                    text = text, scaleOption = typeScale_7_displayText,
                    // Optional
                    modifier = modifier, color = color, fontStyle = fontStyle,
                    fontWeight = fontWeight, fontFamily = fontFamily,
                    letterSpacing = letterSpacing, textDecoration = textDecoration,
                    textAlign = textAlign, overflow = overflow, softWrap = softWrap,
                    maxLines = maxLines, minLines = minLines, onTextLayout = onTextLayout,
                    style = style
                )
            }

            ScaleVariant.BodyText -> {
                throw IllegalArgumentException(default_error)
            }
        }

        is TypeScaleValue.TypeScale8 -> when (scaleVariant) {
            ScaleVariant.DisplayText -> {
                AppText(
                    // Compulsory
                    text = text, scaleOption = typeScale_8_displayText,
                    // Optional
                    modifier = modifier, color = color, fontStyle = fontStyle,
                    fontWeight = fontWeight, fontFamily = fontFamily,
                    letterSpacing = letterSpacing, textDecoration = textDecoration,
                    textAlign = textAlign, overflow = overflow, softWrap = softWrap,
                    maxLines = maxLines, minLines = minLines, onTextLayout = onTextLayout,
                    style = style
                )
            }

            ScaleVariant.BodyText -> {
                throw IllegalArgumentException(default_error)
            }
        }

        is TypeScaleValue.TypeScale9 -> when (scaleVariant) {
            ScaleVariant.DisplayText -> {
                AppText(
                    // Compulsory
                    text = text, scaleOption = typeScale_9_displayText,
                    // Optional
                    modifier = modifier, color = color, fontStyle = fontStyle,
                    fontWeight = fontWeight, fontFamily = fontFamily,
                    letterSpacing = letterSpacing, textDecoration = textDecoration,
                    textAlign = textAlign, overflow = overflow, softWrap = softWrap,
                    maxLines = maxLines, minLines = minLines, onTextLayout = onTextLayout,
                    style = style
                )
            }

            ScaleVariant.BodyText -> {
                throw IllegalArgumentException(default_error)
            }
        }

        is TypeScaleValue.TypeScale10 -> when (scaleVariant) {
            ScaleVariant.DisplayText -> {
                AppText(
                    // Compulsory
                    text = text, scaleOption = typeScale_10_displayText,
                    // Optional
                    modifier = modifier, color = color, fontStyle = fontStyle,
                    fontWeight = fontWeight, fontFamily = fontFamily,
                    letterSpacing = letterSpacing, textDecoration = textDecoration,
                    textAlign = textAlign, overflow = overflow, softWrap = softWrap,
                    maxLines = maxLines, minLines = minLines, onTextLayout = onTextLayout,
                    style = style
                )
            }

            ScaleVariant.BodyText -> {
                throw IllegalArgumentException(default_error)
            }
        }

        is TypeScaleValue.TypeScale11 -> when (scaleVariant) {
            ScaleVariant.DisplayText -> {
                AppText(
                    // Compulsory
                    text = text, scaleOption = typeScale_11_displayText,
                    // Optional
                    modifier = modifier, color = color, fontStyle = fontStyle,
                    fontWeight = fontWeight, fontFamily = fontFamily,
                    letterSpacing = letterSpacing, textDecoration = textDecoration,
                    textAlign = textAlign, overflow = overflow, softWrap = softWrap,
                    maxLines = maxLines, minLines = minLines, onTextLayout = onTextLayout,
                    style = style
                )
            }

            ScaleVariant.BodyText -> {
                throw IllegalArgumentException(default_error)
            }
        }

        is TypeScaleValue.TypeScale12 -> when (scaleVariant) {
            ScaleVariant.DisplayText -> {
                AppText(
                    // Compulsory
                    text = text, scaleOption = typeScale_12_displayText,
                    // Optional
                    modifier = modifier, color = color, fontStyle = fontStyle,
                    fontWeight = fontWeight, fontFamily = fontFamily,
                    letterSpacing = letterSpacing, textDecoration = textDecoration,
                    textAlign = textAlign, overflow = overflow, softWrap = softWrap,
                    maxLines = maxLines, minLines = minLines, onTextLayout = onTextLayout,
                    style = style
                )
            }

            ScaleVariant.BodyText -> {
                throw IllegalArgumentException(default_error)
            }
        }

        is TypeScaleValue.TypeScale13 -> when (scaleVariant) {
            ScaleVariant.DisplayText -> {
                AppText(
                    // Compulsory
                    text = text, scaleOption = typeScale_13_displayText,
                    // Optional
                    modifier = modifier, color = color, fontStyle = fontStyle,
                    fontWeight = fontWeight, fontFamily = fontFamily,
                    letterSpacing = letterSpacing, textDecoration = textDecoration,
                    textAlign = textAlign, overflow = overflow, softWrap = softWrap,
                    maxLines = maxLines, minLines = minLines, onTextLayout = onTextLayout,
                    style = style
                )
            }

            ScaleVariant.BodyText -> {
                throw IllegalArgumentException(default_error)
            }
        }

        is TypeScaleValue.TypeScale14 -> when (scaleVariant) {
            ScaleVariant.DisplayText -> {
                AppText(
                    // Compulsory
                    text = text, scaleOption = typeScale_14_displayText,
                    // Optional
                    modifier = modifier, color = color, fontStyle = fontStyle,
                    fontWeight = fontWeight, fontFamily = fontFamily,
                    letterSpacing = letterSpacing, textDecoration = textDecoration,
                    textAlign = textAlign, overflow = overflow, softWrap = softWrap,
                    maxLines = maxLines, minLines = minLines, onTextLayout = onTextLayout,
                    style = style
                )
            }

            ScaleVariant.BodyText -> {
                throw IllegalArgumentException(default_error)
            }
        }
    }
}

sealed class ScaleVariant {
    data object DisplayText : ScaleVariant()
    data object BodyText : ScaleVariant()
}

sealed class TypeScaleValue {
    data object TypeScale1 : TypeScaleValue()
    data object TypeScale2 : TypeScaleValue()
    data object TypeScale3 : TypeScaleValue()
    data object TypeScale4 : TypeScaleValue()
    data object TypeScale5 : TypeScaleValue()
    data object TypeScale6 : TypeScaleValue()
    data object TypeScale7 : TypeScaleValue()
    data object TypeScale8 : TypeScaleValue()
    data object TypeScale9 : TypeScaleValue()
    data object TypeScale10 : TypeScaleValue()
    data object TypeScale11 : TypeScaleValue()
    data object TypeScale12 : TypeScaleValue()
    data object TypeScale13 : TypeScaleValue()
    data object TypeScale14 : TypeScaleValue()
}

/** ****************************** Implementation(Private) ************************************* **/
@Composable
private fun AppText(
    // Compulsory
    text: String,
    scaleOption: TypeScaleOption,
    // Optional
    modifier: Modifier = Modifier,
    color: Color = Color.Unspecified,
    fontStyle: FontStyle? = null,
    fontWeight: FontWeight? = null,
    fontFamily: FontFamily? = null,
    letterSpacing: TextUnit = TextUnit.Unspecified,
    textDecoration: TextDecoration? = null,
    textAlign: TextAlign? = null,
    overflow: TextOverflow = TextOverflow.Clip,
    softWrap: Boolean = true,
    maxLines: Int = Int.MAX_VALUE,
    minLines: Int = 1,
    onTextLayout: (TextLayoutResult) -> Unit = {},
    style: TextStyle = LocalTextStyle.current,
) {
    Text(
        // Compulsory
        text = text,
        fontSize = scaleOption.size.sp,
        lineHeight = scaleOption.lineHeight.sp,
        modifier = modifier.padding(bottom = scaleOption.paragraphSpacing.dp),
        // Optional
        color = color,
        fontStyle = fontStyle,
        fontWeight = fontWeight,
        fontFamily = fontFamily,
        letterSpacing = letterSpacing,
        textDecoration = textDecoration,
        textAlign = textAlign,
        overflow = overflow,
        softWrap = softWrap,
        maxLines = maxLines,
        minLines = minLines,
        onTextLayout = onTextLayout,
        style = style
    )
}

data class TypeScaleOption(
    val size: Float, val lineHeight: Float, val paragraphSpacing: Float
)

private object TextScaleConstants {
    const val default_error = "Unsupported display text scale variant"

    // TypeScale.1
    val typeScale_1_bodyText = TypeScaleOption(15f, 20f, 10f)

    // TypeScale.2
    val typeScale_2_displayText = TypeScaleOption(17f, 20f, 10f)
    val typeScale_2_bodyText = TypeScaleOption(17f, 24f, 12f)

    // TypeScale.3
    val typeScale_3_displayText = TypeScaleOption(20f, 24f, 12f)
    val typeScale_3_bodyText = TypeScaleOption(20f, 28f, 14f)

    // TypeScale.4
    val typeScale_4_displayText = TypeScaleOption(23f, 28f, 14f)
    val typeScale_4_bodyText = TypeScaleOption(23f, 32f, 16f)

    // TypeScale.5
    val typeScale_5_displayText = TypeScaleOption(26f, 32f, 16f)
    val typeScale_5_bodyText = TypeScaleOption(26f, 36f, 18f)

    // TypeScale.6
    val typeScale_6_displayText = TypeScaleOption(30f, 36f, 18f)
    val typeScale_6_bodyText = TypeScaleOption(30f, 40f, 20f)

    // TypeScale.7
    val typeScale_7_displayText = TypeScaleOption(34f, 40f, 20f)

    // TypeScale.8
    val typeScale_8_displayText = TypeScaleOption(40f, 44f, 22f)

    // TypeScale.9
    val typeScale_9_displayText = TypeScaleOption(46f, 52f, 26f)

    // TypeScale.10
    val typeScale_10_displayText = TypeScaleOption(52f, 60f, 30f)

    // TypeScale.11
    val typeScale_11_displayText = TypeScaleOption(60f, 68f, 34f)

    // TypeScale.12
    val typeScale_12_displayText = TypeScaleOption(68f, 76f, 38f)

    // TypeScale.13
    val typeScale_13_displayText = TypeScaleOption(80f, 88f, 44f)

    // TypeScale.14
    val typeScale_14_displayText = TypeScaleOption(92f, 104f, 52f)
}
/** ****************************** Implementation(Private) ************************************* **/