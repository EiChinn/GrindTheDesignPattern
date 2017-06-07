package com.eichinn.visitor.universal

/**
 * Created by ei_chinn on 2017/6/7.
 */
interface Visitor {
    fun visitConcreteElementA(concreteElementA: ConcreteElementA)
    fun visitConcreteElementB(concreteElementB: ConcreteElementB)
}