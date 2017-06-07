package com.eichinn.visitor.extension

import java.util.*

/**
 * Created by ei_chinn on 2017/6/7.
 */
class Composite(name: String) : Component(name) {

    override fun accept(visitor: Visitor) {
        visitor.visitComposite(this)
        for (child in childComponents) {
            child.accept(visitor)
        }
    }

    override fun someOperation() {
        println("some operation in composite")
    }

    private val childComponents = ArrayList<Component>()

    override fun addChild(child: Component) {
        childComponents.add(child)
    }

    override fun removeChild(child: Component) {
        childComponents.remove(child)
    }

    override fun getChildren(index: Int): Component {
        return childComponents.get(index)
    }
}