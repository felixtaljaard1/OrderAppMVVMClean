package com.example.orderappmvvmclean.order_feature.data.mapper

import com.example.orderappmvvmclean.core.data.local.entities.OrderEntity
import com.example.orderappmvvmclean.order_feature.domain.model.Order

fun Order.toOrderEntity(delivererName:String):OrderEntity{
    return OrderEntity(
        orderId = orderId,
        date = date,
        delivererTime = delivererTime,
        delivererName = delivererName
    )
}