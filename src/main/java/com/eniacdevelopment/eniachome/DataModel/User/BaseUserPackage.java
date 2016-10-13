package com.eniacdevelopment.eniachome.DataModel.User;

import com.eniacdevelopment.eniachome.DataModel.BasePackage;
import com.eniacdevelopment.eniachome.DataModel.PackageType;

/**
 * Created by larsg on 10/13/2016.
 */
public abstract class BaseUserPackage extends BasePackage {
    public BaseUserPackage() {
        this.type = PackageType.USER_PACKAGE;
    }

    public String UserID;
}
