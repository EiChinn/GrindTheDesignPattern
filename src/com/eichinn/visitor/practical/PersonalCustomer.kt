package com.eichinn.visitor.practical

/**
 * Created by ei_chinn on 2017/6/6.
 */
class PersonalCustomer : Customer() {
    override fun accept(visitor: Visitor) {
        visitor.visitPersonalCustomer(this)
    }

    var telephone: String? = null
    var age: Int = 0
}