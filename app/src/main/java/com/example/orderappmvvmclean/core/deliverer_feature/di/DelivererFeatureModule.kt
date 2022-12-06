package com.example.orderappmvvmclean.core.deliverer_feature.di

import com.example.orderappmvvmclean.core.data.local.DelivererDao
import com.example.orderappmvvmclean.core.data.local.ProductDao
import com.example.orderappmvvmclean.core.deliverer_feature.data.repository.DelivererRepositoryImpl
import com.example.orderappmvvmclean.core.deliverer_feature.domain.repository.DelivererRepository
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object DelivererFeatureModule {

    @Provides
    @Singleton
    fun provideDelivererRepository(delivererDao: DelivererDao, productDao: ProductDao): DelivererRepository {
        return DelivererRepositoryImpl(delivererDao,productDao)
    }

}