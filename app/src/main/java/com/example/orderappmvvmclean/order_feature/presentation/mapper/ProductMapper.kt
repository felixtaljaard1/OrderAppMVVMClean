package com.example.orderappmvvmclean.order_feature.presentation.mapper

import com.example.orderappmvvmclean.core.domain.model.Product
import com.example.orderappmvvmclean.order_feature.domain.model.BoughtProduct
import com.example.orderappmvvmclean.order_feature.presentation.state.ProductListItem

fun BoughtProduct.toProductListItem():ProductListItem{
    return ProductListItem(
        id = productId,
        name = name,
        pricePerAmount = pricePerAmount,
        selectedAmount = amount,
        isExpanded = false
    )
}

fun Product.toProductListItem():ProductListItem{
    return ProductListItem(
        id = productId,
        name = name,
        pricePerAmount = pricePerAmount,
        selectedAmount = 0,
        isExpanded = false
    )
}

fun ProductListItem.toBoughtProduct():BoughtProduct{
    return BoughtProduct(
        productId = id,
        name = name,
        pricePerAmount=pricePerAmount,
        amount = selectedAmount
    )
}