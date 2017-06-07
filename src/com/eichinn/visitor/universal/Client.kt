package com.eichinn.visitor.universal

/**
 * Created by ei_chinn on 2017/6/7.
 */
fun main(args: Array<String>) {
    val os = ObjectStructure()

    val elementA = ConcreteElementA()
    val elementB = ConcreteElementB()

    os.addElement(elementA)
    os.addElement(elementB)

    var visitor: Visitor = ConcreteVisitor1()
    os.handleRequest(visitor)

    visitor = ConcreteVisitor2()
    os.handleRequest(visitor)

}