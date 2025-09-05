package com.example.aluvery.ui.theme.components

import androidx.compose.foundation.horizontalScroll
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.aluvery.R
import com.example.aluvery.model.Product
import com.example.aluvery.model.ProductSection
import java.math.BigDecimal


@Composable
fun ProductsSection(productSection: ProductSection) {
    Column {
        Text(
            productSection.title,
            Modifier.padding(top = 40.dp, start = 25.dp, end = 16.dp),
            fontSize = 20.sp,
            fontWeight = FontWeight(400)
        )
        Row(
            Modifier
                .padding(top = 8.dp)
                .fillMaxWidth()
                .horizontalScroll(rememberScrollState()),
            horizontalArrangement = Arrangement.spacedBy(10.dp)

        ) {
            Spacer(Modifier)
            for (p in productSection.products){
                ProductItem(p)
            }
            Spacer(Modifier)
        }
    }
}


@Preview(showBackground = true, showSystemUi = true)
@Composable
private fun ProductsSectionPreview() {
    ProductsSection(ProductSection(title = "asd", listOf(Product("asdasd", BigDecimal(10.0), R.drawable.ic_launcher_background))))
}

