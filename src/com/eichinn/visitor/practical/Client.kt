package com.eichinn.visitor.practical

/**
 * Created by ei_chinn on 2017/6/6.
 */

fun main(args: Array<String>) {
    val colCustomer = ObjectStructure()

    val cm1 = EnterpriseCustomer()
    cm1.name = "ABC集团"
    colCustomer.addElement(cm1)
    val cm2 = EnterpriseCustomer()
    cm2.name = "DEF公司"
    colCustomer.addElement(cm2)
    val cm3 = PersonalCustomer()
    cm3.name = "shana"
    colCustomer.addElement(cm3)

    val serviceRequest = ServiceRequestVisitor()
    colCustomer.handleRequest(serviceRequest)

    val predilectionAnalyze = PredilectionAnalyzeVisitor()
    colCustomer.handleRequest(predilectionAnalyze)

    val worthAnalyze = WorthAnalyzeVisitor()
    colCustomer.handleRequest(worthAnalyze)


}