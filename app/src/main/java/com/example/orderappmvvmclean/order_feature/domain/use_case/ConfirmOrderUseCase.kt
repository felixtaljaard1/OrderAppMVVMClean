package com.example.orderappmvvmclean.order_feature.domain.use_case

import androidx.room.Index
import com.example.orderappmvvmclean.order_feature.domain.model.BoughtProduct
import com.example.orderappmvvmclean.order_feature.domain.model.Order
import com.example.orderappmvvmclean.order_feature.domain.repository.OrderRepository
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import java.time.LocalDate
import java.time.LocalDateTime
import java.time.format.DateTimeFormatter
import java.util.*
import javax.inject.Inject

class ConfirmOrderUseCase @Inject constructor(
    private val orderRepository: OrderRepository
) {

    operator fun invoke(products:List<BoughtProduct>, delivererId:String){
        val coroutineScope = CoroutineScope(Dispatchers.IO)
        val formatter:DateTimeFormatter =
            DateTimeFormatter.ofPattern("dd.MM.yyy HH:mm:ss")
        val date = formatter.format(LocalDateTime.now())
        coroutineScope.launch {
            val delivererName = orderRepository.getDelivererNameById(delivererId)
            orderRepository.insertOrder(
                order = Order(
                    orderId = UUID.randomUUID().toString(),
                    date = date,
                    delivererTime = "As fast as possible",
                    delivererName = delivererName,
                    products = products
                )
            )
        }
    }
}