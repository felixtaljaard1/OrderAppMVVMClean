package com.example.orderappmvvmclean.order_feature.presentation.mapper

import com.example.orderappmvvmclean.core.domain.model.Deliverer
import com.example.orderappmvvmclean.order_feature.presentation.state.DelivererListItem

fun Deliverer.toDelivererListItem():DelivererListItem{
    return DelivererListItem(
        delivererId = delivererId,
        name = name
    )
}