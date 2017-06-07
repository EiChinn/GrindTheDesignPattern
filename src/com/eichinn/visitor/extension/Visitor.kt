package com.eichinn.visitor.extension

/**
 * Created by ei_chinn on 2017/6/7.
 */
interface Visitor {
    fun visitComposite(composite: Composite)
    fun visitLeaf(leaf: Leaf)
}