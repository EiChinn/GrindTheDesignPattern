package com.eichinn.visitor.extension

/**
 * Created by ei_chinn on 2017/6/7.
 */
class ObjectStructure {
    var root: Component? = null

    fun handleRequest(visitor: Visitor) {
        root?.accept(visitor)
    }
}