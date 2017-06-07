package com.eichinn.visitor.extension

/**
 * Created by ei_chinn on 2017/6/7.
 */
fun main(args: Array<String>) {
    val root = Composite("服装")

    val c1 = Composite("男装")
    val c2 = Composite("女装")
    root.addChild(c1)
    root.addChild(c2)

    val l1 = Leaf("衬衣")
    val l2 = Leaf("夹克")
    c1.addChild(l1)
    c1.addChild(l2)
    val l3 = Leaf("衬衣")
    val l4 = Leaf("裙子")
    c2.addChild(l3)
    c2.addChild(l4)

    val os = ObjectStructure()
    os.root = root

//    val visitor = PrintNameVisitor()
    val visitor = PrintStructVisitor()
    os.handleRequest(visitor)



}