package com.eichinn.visitor.universal

import java.util.*

/**
 * Created by ei_chinn on 2017/6/7.
 */
class ObjectStructure {
    val col = ArrayList<Element>()

    fun handleRequest(visitor: Visitor) {
        for (element in col) {
            element.accept(visitor)
        }
    }

    fun addElement(element: Element) {
        col.add(element)
    }
}