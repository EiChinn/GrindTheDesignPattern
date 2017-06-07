package com.eichinn.visitor.universal

/**
 * Created by ei_chinn on 2017/6/7.
 */
class ConcreteElementA : Element() {
    override fun accept(visitor: Visitor) {
        visitor.visitConcreteElementA(this)
    }

    fun operationA(){
        println("operationA")
    }

}