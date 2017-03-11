package com.eichinn.builder.practical;

import java.util.Collection;
import java.util.Map;

/**
 * Created by ei_chinn on 2017/3/11.
 */
public class XmlBuilder implements Builder {
    private StringBuilder result;

    public XmlBuilder() {
        result = new StringBuilder(128);
    }

    @Override
    public void builderHeader(ExportHeaderModel ehm) {
        addXmlHeader();

        //1：拼接文件头的内容
        result.append("    <Header>\n");
        result.append("        <DepId>" + ehm.getDepId() + "</DepId>\n");
        result.append("        <ExportData>" + ehm.getExportData() + "</ExportData>\n");
        result.append("    </Header>\n");
    }

    private void addXmlHeader() {
        result.append("<?xml version='1.0' encode='gb2312'?>\n");
        result.append("<Report>\n");
    }

    @Override
    public void builderBody(Map<String, Collection<ExportDataModel>> mapData) {
        //2：拼接文本体的内容
        result.append("    <Body>\n");
        for (String tblName : mapData.keySet()) {
            //拼接表名称
            result.append("        <Datas TableName=\"" + tblName + "\">\n");

            //循环拼接具体数据
            for (ExportDataModel edm : mapData.get(tblName)) {
                result.append("            <Data>\n");

                result.append("                <ProductId>" + edm.getProductId() + "</ProductId>\n");
                result.append("                <Price>" + edm.getPrice() + "</Price>\n");
                result.append("                <Amount>" + edm.getAmount() + "</Amount>\n");

                result.append("            </Data>\n");
            }

            result.append("        </Datas>\n");

        }
        result.append("    </Body>\n");
    }

    @Override
    public void builderFooter(ExportFooterModel efm) {
        //拼接文件尾的内容
        result.append("    <Footer>\n");
        result.append("        <ExportUser>" + efm.getExportUser() + "</ExportUser>\n");
        result.append("    </Footer>\n");

        addXmlFooter();
    }

    private void addXmlFooter() {
        result.append("</Report>\n");
    }

    public StringBuilder getResult() {
        return result;
    }
}
