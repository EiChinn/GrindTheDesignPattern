package com.eichinn.builder.practical;

/**
 * 描述输出到文件头的内容的对象
 * Created by ei_chinn on 2017/3/11.
 */
public class ExportHeaderModel {
    /**
     * 分公司或门市点编号
     */
    private String depId;

    /**
     * 导出数据的日期
     */
    private String exportData;


    public String getDepId() {
        return depId;
    }

    public void setDepId(String depId) {
        this.depId = depId;
    }

    public String getExportData() {
        return exportData;
    }

    public void setExportData(String exportData) {
        this.exportData = exportData;
    }



}
