package com.example.orderappmvvmclean.core.data.mapper

import com.example.orderappmvvmclean.core.data.local.entities.ProductEntity
import com.example.orderappmvvmclean.core.domain.model.Product

fun ProductEntity.toProduct(): Product {
    return Product(
        productId = productId,
        name = name,
        pricePerAmount = pricePerAmount
    )
}