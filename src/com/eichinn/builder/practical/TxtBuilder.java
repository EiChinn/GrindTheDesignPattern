package com.eichinn.builder.practical;

import java.util.Collection;
import java.util.Map;

/**
 * Created by ei_chinn on 2017/3/11.
 */
public class TxtBuilder implements Builder {
    private StringBuilder result;

    public TxtBuilder() {
        result = new StringBuilder(128);
    }

    @Override
    public void builderHeader(ExportHeaderModel ehm) {
        result.append(ehm.getDepId() + ", " + ehm.getExportData() + "\n");
    }

    @Override
    public void builderBody(Map<String, Collection<ExportDataModel>> mapData) {
        for (String tblName : mapData.keySet()) {
            //先拼接表名称
            result.append(tblName + "\n");

            //然后循环拼接具体数据
            for (ExportDataModel edm : mapData.get(tblName)) {
                result.append(edm.getProductId() + ", " + edm.getPrice() + ", " + edm.getAmount() + "\n");
            }
        }
    }

    @Override
    public void builderFooter(ExportFooterModel efm) {
        result.append(efm.getExportUser());
    }

    public StringBuilder getResult() {
        return result;
    }
}
