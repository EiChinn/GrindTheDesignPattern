package com.eichinn.visitor.practical

/**
 * Created by ei_chinn on 2017/6/6.
 */
interface Visitor {
    fun visitEnterpriseCustomer(enterpriseCustomer: EnterpriseCustomer)
    fun visitPersonalCustomer(personalCustomer: PersonalCustomer)
}