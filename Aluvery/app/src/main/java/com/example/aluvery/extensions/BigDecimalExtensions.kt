package com.example.aluvery.extensions

import java.math.BigDecimal
import java.text.NumberFormat
import java.util.Locale

fun BigDecimal.toBrazilFormat():String {
    return  NumberFormat.getCurrencyInstance(Locale("pt", "br")).format(this)
}
