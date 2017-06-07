package com.eichinn.visitor.universal

/**
 * Created by ei_chinn on 2017/6/7.
 */
abstract class Element {
    abstract fun accept(visitor: Visitor)
}