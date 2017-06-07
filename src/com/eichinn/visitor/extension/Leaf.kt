package com.eichinn.visitor.extension

/**
 * Created by ei_chinn on 2017/6/7.
 */
class Leaf(name: String) : Component(name) {
    override fun accept(visitor: Visitor) {
        visitor.visitLeaf(this)
    }

    override fun someOperation() {
        println("some operation in leaf")
    }

}
