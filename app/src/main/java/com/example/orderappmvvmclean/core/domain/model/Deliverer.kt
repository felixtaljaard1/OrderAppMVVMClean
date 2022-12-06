package com.example.orderappmvvmclean.core.domain.model

import com.example.orderappmvvmclean.core.domain.SelectAndSortableByName

data class Deliverer(
    val delivererId:String,
    override val name:String,
    val products:List<Product>
):SelectAndSortableByName
