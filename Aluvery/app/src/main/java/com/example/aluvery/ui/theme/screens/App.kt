package com.example.aluvery.ui.theme.screens

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.aluvery.R
import com.example.aluvery.model.Product
import com.example.aluvery.model.ProductSection
import com.example.aluvery.ui.theme.AluveryTheme
import com.example.aluvery.ui.theme.components.ProductsSection
import java.math.BigDecimal

@Composable
fun App(modifier: Modifier = Modifier) {
    AluveryTheme {
        Surface {
            Column(
                Modifier
                    .fillMaxSize()
                    .verticalScroll(rememberScrollState()),
                verticalArrangement = Arrangement.spacedBy(16.dp),
            ) {
                Spacer(Modifier)
                ProductsSection(
                    productSection = ProductSection(
                        title = "t1",
                        listOf(
                            Product("asdasd", BigDecimal(10.0), R.drawable.ic_launcher_background),
                            Product("asdasd", BigDecimal(10.0), R.drawable.ic_launcher_background),
                        )
                    )
                )
                ProductsSection(
                    productSection = ProductSection(
                        title = "t1",
                        listOf(
                            Product("asdasd", BigDecimal(10.0), R.drawable.ic_launcher_background),
                            Product("asdasd", BigDecimal(10.0), R.drawable.ic_launcher_background),
                        )
                    )
                )
                ProductsSection(
                    productSection = ProductSection(
                        title = "t1",
                        listOf(
                            Product("asdasd", BigDecimal(10.0), R.drawable.ic_launcher_background),
                            Product("asdasd", BigDecimal(10.0), R.drawable.ic_launcher_background),
                        )
                    )
                )
                Spacer(Modifier)
            }
        }
    }
}


@Preview(showBackground = true, showSystemUi = true)
@Composable
private fun AppPreview() {
    App()
}

