package com.eichinn.visitor.practical

/**
 * Created by ei_chinn on 2017/6/5.
 */
abstract class Customer {
    var customerId: String? = null
    var name: String? = null

    abstract fun accept(visitor: Visitor)
}
