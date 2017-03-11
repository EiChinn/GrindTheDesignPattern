package com.eichinn.builder.practical;

import java.util.Collection;
import java.util.Map;

/**
 * Created by ei_chinn on 2017/3/11.
 */
public class Director {
    private Builder builder;

    public Director(Builder builder) {
        this.builder = builder;
    }

    public void construct(ExportHeaderModel ehm, Map<String, Collection<ExportDataModel>> mapData, ExportFooterModel efm) {
        builder.builderHeader(ehm);
        builder.builderBody(mapData);
        builder.builderFooter(efm);
    }
}
