package com.example.orderappmvvmclean.core.data.local

import androidx.room.*
import com.example.orderappmvvmclean.core.data.local.entities.DelivererEntity
import com.example.orderappmvvmclean.core.data.local.entities.DelivererWithProductsDataObject

@Dao
interface DelivererDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertDeliverer(delivererEntity: DelivererEntity)

    @Transaction
    @Query("SELECT * FROM DelivererEntity")
    suspend fun  getDeliverers():List<DelivererWithProductsDataObject>

    @Query("SELECT name FROM DelivererEntity WHERE delivererId = :delivererId")
    suspend fun getDelivererNameById(delivererId:String):String
}