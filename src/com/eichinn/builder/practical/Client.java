package com.eichinn.builder.practical;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;

/**
 * Created by ei_chinn on 2017/3/11.
 */
public class Client {
    public static void main(String[] args) {
        //prepare data
        ExportHeaderModel ehm = new ExportHeaderModel();
        ehm.setDepId("Company");
        ehm.setExportData("2017-03-11");

        HashMap<String, Collection<ExportDataModel>> mapData = new HashMap<>();
        Collection<ExportDataModel> col = new ArrayList<>();

        ExportDataModel edm1 = new ExportDataModel();
        edm1.setProductId("001");
        edm1.setPrice(100);
        edm1.setAmount(80);
        col.add(edm1);

        ExportDataModel edm2 = new ExportDataModel();
        edm2.setProductId("002");
        edm2.setPrice(99);
        edm2.setAmount(55);
        col.add(edm2);

        mapData.put("Sales record", col);

        ExportFooterModel efm = new ExportFooterModel();
        efm.setExportUser("ei_chinn");

        /*//test ExportToTxt
        ExportToTxt exportToText = new ExportToTxt();
        exportToText.export(ehm, mapData, efm);

        System.out.println();

        //test ExportToXml
        ExportToXml exportToXml = new ExportToXml();
        exportToXml.export(ehm, mapData, efm);*/

        //test TxtBuilder
        TxtBuilder txtBuilder = new TxtBuilder();
        Director director = new Director(txtBuilder);
        director.construct(ehm, mapData, efm);
        System.out.println("输出到文本文件的内容： ");
        System.out.println(txtBuilder.getResult().toString());

        //test XmlBuilder
        XmlBuilder xmlBuilder = new XmlBuilder();
        director = new Director(xmlBuilder);
        director.construct(ehm, mapData, efm);
        System.out.println("输出到xml文件到内容： ");
        System.out.println(xmlBuilder.getResult().toString());
    }
}
