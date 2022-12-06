package com.example.orderappmvvmclean.core.domain.model

import com.example.orderappmvvmclean.core.domain.SelectAndSortableByName

data class Product(
    val productId:String,
    override val name:String,
    val pricePerAmount:Float
):SelectAndSortableByName
