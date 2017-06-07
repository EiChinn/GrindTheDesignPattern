package com.eichinn.visitor.practical

import java.util.*

/**
 * Created by ei_chinn on 2017/6/6.
 */
class ObjectStructure {
    val col = ArrayList<Customer>()
    fun addElement(customer: Customer) {
        col.add(customer)
    }

    fun handleRequest(visitor: Visitor) {
        for (customer in col) {
            customer.accept(visitor)
        }
    }
}