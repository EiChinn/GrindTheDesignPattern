package com.eichinn.builder.practical;

import java.util.Collection;
import java.util.Map;

/**
 * Created by ei_chinn on 2017/3/11.
 */
public interface Builder {
    void builderHeader(ExportHeaderModel ehm);
    void builderBody(Map<String, Collection<ExportDataModel>> mapData);
    void builderFooter(ExportFooterModel efm);
}
