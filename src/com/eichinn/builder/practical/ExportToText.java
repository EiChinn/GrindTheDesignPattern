package com.eichinn.builder.practical;

import java.util.Collection;
import java.util.Map;

/**
 * 导出数据到文本文件的对象
 * Created by ei_chinn on 2017/3/11.
 */
public class ExportToText {
    /**
     * 导出数据到文本文件
     * @param ehm 文件头的内容
     * @param mapData 数据内容
     * @param efm 文件尾的内容
     */
    public void export(ExportHeaderModel ehm, Map<String, Collection<ExportDataModel>> mapData, ExportFooterModel efm) {
        //用来记录最终输出的文件内容
        StringBuilder result = new StringBuilder(128);

        //1：先来拼接文件头的内容
        result.append(ehm.getDepId() + ", " + ehm.getExportData() + "\n");

        //2：接着来拼接文件头的内容
        for (String tblName : mapData.keySet()) {
            //先拼接表名称
            result.append(tblName + "\n");

            //然后循环拼接具体数据
            for (ExportDataModel edm : mapData.get(tblName)) {
                result.append(edm.getProductId() + ", " + edm.getPrice() + ", " + edm.getAmount() + "\n");
            }
        }

        //3： 最后拼接文件尾的内容
        result.append(efm.getExportUser());

        //输出文件内容
        System.out.println("输出到文本文件的内容： ");
        System.out.println(result.toString());

    }
}
