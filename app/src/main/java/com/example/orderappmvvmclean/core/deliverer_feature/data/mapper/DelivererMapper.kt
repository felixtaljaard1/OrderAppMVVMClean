package com.example.orderappmvvmclean.core.deliverer_feature.data.mapper

import com.example.orderappmvvmclean.core.data.local.entities.DelivererEntity
import com.example.orderappmvvmclean.core.domain.model.Deliverer

fun Deliverer.toDelivererEntity(): DelivererEntity {
    return DelivererEntity(
        delivererId = delivererId,
        name = name
    )
}