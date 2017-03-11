package com.eichinn.builder.practical;

import java.util.Collection;
import java.util.Map;

/**
 * 导出数据到xml文件的对象
 * Created by ei_chinn on 2017/3/11.
 */
public class ExportToXml {

    /**
     * 导出数据到xml文件
     * @param ehm 文件头到内容
     * @param mapData 数据到内容
     * @param efm 文件尾的内容
     */
    public void export(ExportHeaderModel ehm, Map<String, Collection<ExportDataModel>> mapData, ExportFooterModel efm) {
        StringBuilder result = new StringBuilder(128);

        result.append("<?xml version='1.0' encode='gb2312'?>\n");
        result.append("<Report>\n");
        //1：拼接文件头的内容
        result.append("    <Header>\n");
        result.append("        <DepId>" + ehm.getDepId() + "</DepId>\n");
        result.append("        <ExportData>" + ehm.getExportData() + "</ExportData>\n");
        result.append("    </Header>\n");

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

        //拼接文件尾的内容
        result.append("    <Footer>\n");
        result.append("        <ExportUser>" + efm.getExportUser() + "</ExportUser>\n");
        result.append("    </Footer>\n");

        result.append("</Report>\n");

        //输出文件内容
        System.out.println("输出到xml文件到内容： ");
        System.out.println(result.toString());
    }
}
