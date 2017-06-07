package com.eichinn.visitor.practical

/**
 * Created by ei_chinn on 2017/6/6.
 */
class PredilectionAnalyzeVisitor : Visitor{
    override fun visitEnterpriseCustomer(enterpriseCustomer: EnterpriseCustomer) {
        println("Enterprise customer ${enterpriseCustomer.name} predilection analyze")
    }

    override fun visitPersonalCustomer(personalCustomer: PersonalCustomer) {
        println("personal customer ${personalCustomer.name} predilection analyze")
    }
}