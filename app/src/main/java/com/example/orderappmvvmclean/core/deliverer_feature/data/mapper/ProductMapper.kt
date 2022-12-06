package com.example.orderappmvvmclean.core.deliverer_feature.data.mapper

import com.example.orderappmvvmclean.core.data.local.entities.ProductEntity
import com.example.orderappmvvmclean.core.domain.model.Product

fun Product.toProductEntity(delivererId:String): ProductEntity {
    return ProductEntity(
        productId = productId,
        name = name,
        pricePerAmount = pricePerAmount,
        belongsToDeliverer = delivererId
    )
}