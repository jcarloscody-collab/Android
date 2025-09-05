package com.example.aluvery.utils

import androidx.compose.ui.tooling.preview.datasource.LoremIpsum
import com.example.aluvery.model.Product
import com.example.aluvery.model.ProductSection
import java.math.BigDecimal

val cad1 = ProductSection(
    title = "Cardápio 1",
    listOf(
        Product(LoremIpsum(20).values.first(), BigDecimal(10.0),  "https://images.pexels.com/photos/65882/chocolate-dark-coffee-confiserie-65882.jpeg",),
        Product(
            name = "Chocolate",
            price = BigDecimal("3.99"),
            image = "https://images.pexels.com/photos/65882/chocolate-dark-coffee-confiserie-65882.jpeg",
        ),
        Product(
            name = "Sorvete",
            price = BigDecimal("5.99"),
            image = "https://images.pexels.com/photos/1352278/pexels-photo-1352278.jpeg",
        ),
        Product(
            name = "Bolo",
            price = BigDecimal("11.99"),
            image = "https://images.pexels.com/photos/291528/pexels-photo-291528.jpeg",
        )
    )
)

val cad2 = ProductSection(
    title = "Cardápio 2",
    listOf(
        Product(LoremIpsum(20).values.first(), BigDecimal(10.0),  "https://images.pexels.com/photos/65882/chocolate-dark-coffee-confiserie-65882.jpeg",),
        Product(
            name = "Cerveja",
            price = BigDecimal("5.99"),
            image = "https://images.pexels.com/photos/1552630/pexels-photo-1552630.jpeg",
        ),
        Product(
            name = "Refrigerante",
            price = BigDecimal("4.99"),
            image = "https://images.pexels.com/photos/2775860/pexels-photo-2775860.jpeg"
        ),
        Product(
            name = "Suco",
            price = BigDecimal("7.99"),
            image = "https://images.pexels.com/photos/96974/pexels-photo-96974.jpeg"
        ),
        Product(
            name = "Água",
            price = BigDecimal("2.99"),
            image = "https://images.pexels.com/photos/327090/pexels-photo-327090.jpeg"
        )
    )
)

val cad3 = ProductSection(
    title = "Cardápio 3",
    listOf(
        Product(LoremIpsum(20).values.first(), BigDecimal(10.0),  "https://images.pexels.com/photos/65882/chocolate-dark-coffee-confiserie-65882.jpeg",),
        Product(LoremIpsum(20).values.first(), BigDecimal(10.0),  "https://images.pexels.com/photos/65882/chocolate-dark-coffee-confiserie-65882.jpeg",),
        Product(LoremIpsum(20).values.first(), BigDecimal(10.0),  "https://images.pexels.com/photos/65882/chocolate-dark-coffee-confiserie-65882.jpeg",),
        Product(LoremIpsum(20).values.first(), BigDecimal(10.0),  "https://images.pexels.com/photos/65882/chocolate-dark-coffee-confiserie-65882.jpeg",),
        Product(LoremIpsum(20).values.first(), BigDecimal(10.0),  "https://images.pexels.com/photos/65882/chocolate-dark-coffee-confiserie-65882.jpeg",),
        Product(LoremIpsum(20).values.first(), BigDecimal(10.0),  "https://images.pexels.com/photos/65882/chocolate-dark-coffee-confiserie-65882.jpeg",),
        Product(LoremIpsum(20).values.first(), BigDecimal(10.0), "https://images.pexels.com/photos/65882/chocolate-dark-coffee-confiserie-65882.jpeg",),
        Product(LoremIpsum(20).values.first(), BigDecimal(10.0), "https://images.pexels.com/photos/65882/chocolate-dark-coffee-confiserie-65882.jpeg",),
        Product(LoremIpsum(20).values.first(), BigDecimal(10.0), "https://images.pexels.com/photos/65882/chocolate-dark-coffee-confiserie-65882.jpeg",),
        Product(LoremIpsum(20).values.first(), BigDecimal(10.0),  "https://images.pexels.com/photos/65882/chocolate-dark-coffee-confiserie-65882.jpeg",),
        Product(LoremIpsum(20).values.first(), BigDecimal(10.0),  "https://images.pexels.com/photos/65882/chocolate-dark-coffee-confiserie-65882.jpeg",),
    )
)

val sampleSections = mapOf(
    "Promoções" to cad3,
    "Doces" to cad2,
    "Bebidas" to cad1
)