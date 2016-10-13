package com.eniacdevelopment.serialization.DataModel.User;

import com.eniacdevelopment.serialization.DataModel.BasePackage;
import com.eniacdevelopment.serialization.DataModel.PackageType;

/**
 * Created by larsg on 10/13/2016.
 */
public abstract class BaseUserPackage extends BasePackage {
    public BaseUserPackage() {
        this.type = PackageType.USER_PACKAGE;
    }

    public String UserID;
}
