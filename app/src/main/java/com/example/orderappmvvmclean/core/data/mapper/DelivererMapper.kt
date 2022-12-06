package com.example.orderappmvvmclean.core.data.mapper

import com.example.orderappmvvmclean.core.data.local.DelivererDao
import com.example.orderappmvvmclean.core.data.local.entities.DelivererEntity
import com.example.orderappmvvmclean.core.domain.model.Deliverer
import com.example.orderappmvvmclean.core.domain.model.Product

fun DelivererEntity.toDeliverer(products:List<Product>): Deliverer {
    return Deliverer(
        delivererId = delivererId,
        name = name,
        products = products
    )
}