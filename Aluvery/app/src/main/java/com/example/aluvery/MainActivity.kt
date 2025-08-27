package com.example.aluvery

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.aluvery.ui.theme.AluveryTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            AluveryTheme {
                Surface {
                    MyFirstComposable()
                }
            }
        }
    }
}


@Composable
fun MyFirstComposable(){
    Column(
        Modifier
            .padding(30.dp, 20.dp, 10.dp, 0.dp)
            .background(color = Color.Blue)
            .fillMaxWidth()
    ) {
        Column {
            Text("olá mundo")
            Text("olá mundo")
        }

        Row (
            Modifier.background(color = Color.Red)
        ) {
            Text("olá mundo")
            Text("olá mundo")
        }
    }
}


@Preview(
    name = "Initial",
    showSystemUi = true,
)
@Composable
fun Prev (){
    AluveryTheme {
        Surface {
            MyFirstComposable()
        }
    }
}

@Preview(
    name = "Initiall",
    showSystemUi = true,
)
@Composable
fun Prev2 (){
    AluveryTheme {
        Surface {
            MyFirstComposable()
        }
    }
}