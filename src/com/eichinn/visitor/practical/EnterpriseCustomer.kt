package com.eichinn.visitor.practical

/**
 * Created by ei_chinn on 2017/6/5.
 */
class EnterpriseCustomer : Customer() {
    override fun accept(visitor: Visitor) {
        visitor.visitEnterpriseCustomer(this)
    }

    var linkMan: String? = null
    var linkTelephone: String? = null
    var registerAddress: String? = null

}
