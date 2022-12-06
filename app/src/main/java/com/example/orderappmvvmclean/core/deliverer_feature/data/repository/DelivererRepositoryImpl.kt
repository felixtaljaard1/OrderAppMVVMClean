package com.example.orderappmvvmclean.core.deliverer_feature.data.repository

import com.example.orderappmvvmclean.core.data.local.DelivererDao
import com.example.orderappmvvmclean.core.data.local.ProductDao
import com.example.orderappmvvmclean.core.deliverer_feature.data.mapper.toDelivererEntity
import com.example.orderappmvvmclean.core.deliverer_feature.data.mapper.toProductEntity
import com.example.orderappmvvmclean.core.deliverer_feature.domain.repository.DelivererRepository
import com.example.orderappmvvmclean.core.domain.model.Deliverer
import com.example.orderappmvvmclean.core.domain.model.Product
import javax.inject.Inject

class DelivererRepositoryImpl @Inject constructor(
    private val delivererDao: DelivererDao,
    private val productDao: ProductDao
): DelivererRepository {

    override suspend fun insertDeliverers(list: List<Deliverer>) {
        list.forEach { deliverer ->
            delivererDao.insertDeliverer(deliverer.toDelivererEntity())
            insertProducts(deliverer.products, deliverer.delivererId)
        }
    }

    override suspend fun insertProducts(list: List<Product>, delivererId:String) {
        list.forEach { product ->
            productDao.insertProduct(product.toProductEntity(delivererId))
        }
    }

}