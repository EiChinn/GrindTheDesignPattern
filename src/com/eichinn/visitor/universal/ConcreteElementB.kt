package com.eichinn.visitor.universal

/**
 * Created by ei_chinn on 2017/6/7.
 */
class ConcreteElementB : Element() {
    override fun accept(visitor: Visitor) {
        visitor.visitConcreteElementB(this)
    }

    fun operationB() {
        println("operationB")
    }
}