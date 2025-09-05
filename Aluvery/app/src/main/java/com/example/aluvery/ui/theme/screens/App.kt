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
import androidx.compose.ui.tooling.preview.datasource.LoremIpsum
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
                        title = "Cardápio 1",
                        listOf(
                            Product(LoremIpsum(20).values.first(), BigDecimal(10.0), R.drawable.pizza),
                            Product(LoremIpsum(20).values.first(), BigDecimal(10.0), R.drawable.pizza),
                        )
                    )
                )
                ProductsSection(
                    productSection = ProductSection(
                        title = "Cardápio 2",
                        listOf(
                            Product(LoremIpsum(20).values.first(), BigDecimal(10.0), R.drawable.pizza),
                            Product(LoremIpsum(20).values.first(), BigDecimal(10.0), R.drawable.pizza),
                        )
                    )
                )
                ProductsSection(
                    productSection = ProductSection(
                        title = "Cardápio 3",
                        listOf(
                            Product(LoremIpsum(20).values.first(), BigDecimal(10.0), R.drawable.pizza),
                            Product(LoremIpsum(20).values.first(), BigDecimal(10.0), R.drawable.pizza),
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

