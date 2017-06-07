package com.eichinn.visitor.practical

/**
 * Created by ei_chinn on 2017/6/6.
 */
class ServiceRequestVisitor : Visitor {
    override fun visitEnterpriseCustomer(enterpriseCustomer: EnterpriseCustomer) {
        println("Enterprise customer ${enterpriseCustomer.name} service request")
    }

    override fun visitPersonalCustomer(personalCustomer: PersonalCustomer) {
        println("personal customer ${personalCustomer.name} service request")
    }
}