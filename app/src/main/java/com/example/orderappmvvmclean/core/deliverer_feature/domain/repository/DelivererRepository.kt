package com.example.orderappmvvmclean.core.deliverer_feature.domain.repository

import com.example.orderappmvvmclean.core.domain.model.Deliverer
import com.example.orderappmvvmclean.core.domain.model.Product

interface DelivererRepository {

    suspend fun insertDeliverers(list:List<Deliverer>)

    suspend fun insertProducts(list:List<Product>, delivererId:String)

}