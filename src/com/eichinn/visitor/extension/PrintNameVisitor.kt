package com.eichinn.visitor.extension

/**
 * Created by ei_chinn on 2017/6/7.
 */
class PrintNameVisitor : Visitor {
    override fun visitComposite(composite: Composite) {
        println("composite: " + composite.name)
        for (c in composite.childComponents) {
            c.accept(this)
        }
    }

    override fun visitLeaf(leaf: Leaf) {
        println("leaf: " + leaf.name)
    }

}