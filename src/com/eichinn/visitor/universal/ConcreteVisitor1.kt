package com.eichinn.visitor.universal

/**
 * Created by ei_chinn on 2017/6/7.
 */
class ConcreteVisitor1 : Visitor {
    override fun visitConcreteElementA(concreteElementA: ConcreteElementA) {
        //do something
        println("visitor1 do something before call elementA's operation")
        concreteElementA.operationA()
        //do something
        println("visitor1 do something after call elementA's operation")

    }

    override fun visitConcreteElementB(concreteElementB: ConcreteElementB) {
        //do something
        println("visitor1 do something before call elementB's operation")
        concreteElementB.operationB()
        //do something
        println("visitor1do something after call elementB's operation")
    }

}