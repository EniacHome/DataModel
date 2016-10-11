package com.eniacdevelopment.serialization.DataModel;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

/**
 * Created by larsg on 10/5/2016.
 */
@JsonTypeInfo(use=JsonTypeInfo.As.PROPERTY)
@JsonSubTypes(
        @JsonSubTypes.Type(name = )
)
public abstract class AbstractPackage {
    public PackageType PackageType;
}
