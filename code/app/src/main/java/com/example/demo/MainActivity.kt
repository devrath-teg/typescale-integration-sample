package com.example.demo

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.demo.custom.EconomistText
import com.example.demo.custom.ScaleVariant
import com.example.demo.custom.TypeScaleValue
import com.example.demo.font.SampleText
import com.example.demo.ui.theme.DemoTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            DemoTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier
                        .verticalScroll(rememberScrollState())
                        .fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    //AllTypeScales()
                    Single()
                }
            }
        }
    }


    @Composable
    private fun Single() {
        Column(
            modifier = Modifier.fillMaxSize()
        ) {
            //Text(text = "<---------TypeScale4--------->")
            EconomistText(
                text = SampleText.withParagraph,
                typeScaleValue = TypeScaleValue.TypeScale4,
                scaleVariant = ScaleVariant.DisplayText,
                isBottomSpacingEnabled = true,
                modifier = Modifier
                    .fillMaxWidth()
                    .background(color = Color(0xFF3700B3)),
                color = Color(0xFFFFFFFF)
            )
           //Text(text = "<---------TypeScale4--------->")
        }
    }

    @Composable
    private fun AllTypeScales() {
        Column(
            modifier = Modifier.fillMaxSize()
        ) {
            Text(text = "<---------TypeScale1--------->")
            EconomistText(
                text = "BodyText",
                typeScaleValue = TypeScaleValue.TypeScale1,
                scaleVariant = ScaleVariant.BodyText,
                modifier = Modifier
                    .fillMaxWidth()
                    .background(color = Color(0xFF3700B3)),
                color = Color(0xFFFFFFFF)
            )
            Text(text = "<---------TypeScale1--------->")
            Text(text = "\n")
            Text(text = "<---------TypeScale2--------->")
            EconomistText(
                text = "DisplayText",
                typeScaleValue = TypeScaleValue.TypeScale2,
                scaleVariant = ScaleVariant.DisplayText,
                modifier = Modifier
                    .fillMaxWidth()
                    .background(color = Color(0xFF3700B3)),
                color = Color(0xFFFFFFFF)
            )
            EconomistText(
                text = "BodyText",
                typeScaleValue = TypeScaleValue.TypeScale2,
                scaleVariant = ScaleVariant.BodyText,
                modifier = Modifier
                    .fillMaxWidth()
                    .background(color = Color(0xFF000000)),
                color = Color(0xFFFFFFFF)
            )
            Text(text = "<---------TypeScale2--------->")
            Text(text = "\n")
            Text(text = "<---------TypeScale3--------->")
            EconomistText(
                text = "DisplayText",
                typeScaleValue = TypeScaleValue.TypeScale3,
                scaleVariant = ScaleVariant.DisplayText,
                modifier = Modifier
                    .fillMaxWidth()
                    .background(color = Color(0xFF3700B3)),
                color = Color(0xFFFFFFFF)
            )
            EconomistText(
                text = "BodyText",
                typeScaleValue = TypeScaleValue.TypeScale3,
                scaleVariant = ScaleVariant.BodyText,
                modifier = Modifier
                    .fillMaxWidth()
                    .background(color = Color(0xFF000000)),
                color = Color(0xFFFFFFFF)
            )
            Text(text = "<---------TypeScale3--------->")
            Text(text = "\n")
            Text(text = "<---------TypeScale4--------->")
            EconomistText(
                text = "DisplayText",
                typeScaleValue = TypeScaleValue.TypeScale4,
                scaleVariant = ScaleVariant.DisplayText,
                modifier = Modifier
                    .fillMaxWidth()
                    .background(color = Color(0xFF3700B3)),
                color = Color(0xFFFFFFFF)
            )
            EconomistText(
                text = "BodyText",
                typeScaleValue = TypeScaleValue.TypeScale4,
                scaleVariant = ScaleVariant.BodyText,
                modifier = Modifier
                    .fillMaxWidth()
                    .background(color = Color(0xFF000000)),
                color = Color(0xFFFFFFFF)
            )
            Text(text = "<---------TypeScale4--------->")
            Text(text = "\n")
            Text(text = "<---------TypeScale5--------->")
            EconomistText(
                text = "DisplayText",
                typeScaleValue = TypeScaleValue.TypeScale5,
                scaleVariant = ScaleVariant.DisplayText,
                modifier = Modifier
                    .fillMaxWidth()
                    .background(color = Color(0xFF3700B3)),
                color = Color(0xFFFFFFFF)
            )
            EconomistText(
                text = "BodyText",
                typeScaleValue = TypeScaleValue.TypeScale5,
                scaleVariant = ScaleVariant.BodyText,
                modifier = Modifier
                    .fillMaxWidth()
                    .background(color = Color(0xFF000000)),
                color = Color(0xFFFFFFFF)
            )
            Text(text = "<---------TypeScale5--------->")
            Text(text = "\n")
            Text(text = "<---------TypeScale6--------->")
            EconomistText(
                text = "DisplayText",
                typeScaleValue = TypeScaleValue.TypeScale6,
                scaleVariant = ScaleVariant.DisplayText,
                modifier = Modifier
                    .fillMaxWidth()
                    .background(color = Color(0xFF3700B3)),
                color = Color(0xFFFFFFFF)
            )
            EconomistText(
                text = "BodyText",
                typeScaleValue = TypeScaleValue.TypeScale6,
                scaleVariant = ScaleVariant.BodyText,
                modifier = Modifier
                    .fillMaxWidth()
                    .background(color = Color(0xFF000000)),
                color = Color(0xFFFFFFFF)
            )
            Text(text = "<---------TypeScale6--------->")
            Text(text = "\n")
            Text(text = "<---------TypeScale7--------->")
            EconomistText(
                text = "DisplayText",
                typeScaleValue = TypeScaleValue.TypeScale7,
                scaleVariant = ScaleVariant.DisplayText,
                modifier = Modifier
                    .fillMaxWidth()
                    .background(color = Color(0xFF3700B3)),
                color = Color(0xFFFFFFFF)
            )
            Text(text = "<---------TypeScale7--------->")
            Text(text = "\n")
            Text(text = "<---------TypeScale8--------->")
            EconomistText(
                text = "DisplayText",
                typeScaleValue = TypeScaleValue.TypeScale8,
                scaleVariant = ScaleVariant.DisplayText,
                modifier = Modifier
                    .fillMaxWidth()
                    .background(color = Color(0xFF3700B3)),
                color = Color(0xFFFFFFFF)
            )
            Text(text = "<---------TypeScale8--------->")
            Text(text = "\n")
            Text(text = "<---------TypeScale9--------->")
            EconomistText(
                text = "DisplayText",
                typeScaleValue = TypeScaleValue.TypeScale9,
                scaleVariant = ScaleVariant.DisplayText,
                modifier = Modifier
                    .fillMaxWidth()
                    .background(color = Color(0xFF3700B3)),
                color = Color(0xFFFFFFFF)
            )
            Text(text = "<---------TypeScale9--------->")
            Text(text = "\n")
            Text(text = "<---------TypeScale10--------->")
            EconomistText(
                text = "DisplayText",
                typeScaleValue = TypeScaleValue.TypeScale10,
                scaleVariant = ScaleVariant.DisplayText,
                modifier = Modifier
                    .fillMaxWidth()
                    .background(color = Color(0xFF3700B3)),
                color = Color(0xFFFFFFFF)
            )
            Text(text = "<---------TypeScale10--------->")
            Text(text = "\n")
            Text(text = "<---------TypeScale11--------->")
            EconomistText(
                text = "DisplayText",
                typeScaleValue = TypeScaleValue.TypeScale11,
                scaleVariant = ScaleVariant.DisplayText,
                modifier = Modifier
                    .fillMaxWidth()
                    .background(color = Color(0xFF3700B3)),
                color = Color(0xFFFFFFFF)
            )
            Text(text = "<---------TypeScale11--------->")
            Text(text = "\n")
            Text(text = "<---------TypeScale12--------->")
            EconomistText(
                text = "DisplayText",
                typeScaleValue = TypeScaleValue.TypeScale12,
                scaleVariant = ScaleVariant.DisplayText,
                modifier = Modifier
                    .fillMaxWidth()
                    .background(color = Color(0xFF3700B3)),
                color = Color(0xFFFFFFFF)
            )
            Text(text = "<---------TypeScale12--------->")
            Text(text = "\n")
            Text(text = "<---------TypeScale13--------->")
            EconomistText(
                text = "DisplayText",
                typeScaleValue = TypeScaleValue.TypeScale13,
                scaleVariant = ScaleVariant.DisplayText,
                modifier = Modifier
                    .fillMaxWidth()
                    .background(color = Color(0xFF3700B3)),
                color = Color(0xFFFFFFFF)
            )
            Text(text = "<---------TypeScale13--------->")
            Text(text = "\n")
            Text(text = "<---------TypeScale14--------->")
            EconomistText(
                text = "DisplayText",
                typeScaleValue = TypeScaleValue.TypeScale14,
                scaleVariant = ScaleVariant.DisplayText,
                modifier = Modifier
                    .fillMaxWidth()
                    .background(color = Color(0xFF3700B3)),
                color = Color(0xFFFFFFFF),
                isBottomSpacingEnabled = true
            )
            Text(text = "<---------TypeScale14--------->")
        }
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    DemoTheme {
        Greeting("Android")
    }
}