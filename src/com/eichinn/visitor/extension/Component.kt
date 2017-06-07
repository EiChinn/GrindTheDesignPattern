package com.eichinn.visitor.extension

/**
 * Created by ei_chinn on 2017/6/7.
 */
abstract class Component {
    val name: String

    constructor(name: String) {
        this.name = name
    }

    abstract fun someOperation()

    open fun addChild(child: Component) {
        throw UnsupportedOperationException("unsupported Operation")
    }

    open fun removeChild(child: Component) {
        throw UnsupportedOperationException("unsupported Operation")
    }

    open fun getChildren(index: Int): Component {
        throw UnsupportedOperationException("unsupported Operation")
    }

    abstract fun accept(visitor: Visitor)
}