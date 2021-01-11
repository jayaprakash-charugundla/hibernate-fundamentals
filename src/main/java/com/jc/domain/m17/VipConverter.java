package com.jc.domain.m17;

import javax.persistence.AttributeConverter;

public class VipConverter implements AttributeConverter<Boolean, String> {
    @Override
    public String convertToDatabaseColumn(Boolean attribute) {
        return attribute ? "Yes" : "No";
    }

    @Override
    public Boolean convertToEntityAttribute(String dbData) {
        return dbData.equalsIgnoreCase("Yes");
    }
}
