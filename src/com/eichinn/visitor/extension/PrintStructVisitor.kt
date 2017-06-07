package com.eichinn.visitor.extension

/**
 * Created by ei_chinn on 2017/6/7.
 */
class PrintStructVisitor : Visitor {
    var preStr = ""

    override fun visitComposite(composite: Composite) {
        println("$preStr+${composite.name}")

        preStr += " "
        for (component in composite.childComponents) {
            component.accept(this)
        }
        preStr = preStr.substring(0, preStr.length - 1)
    }

    override fun visitLeaf(leaf: Leaf) {//To change body of created functions use File | Settings | File Templates.
        println("$preStr-${leaf.name}")
    }

}