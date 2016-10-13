package com.eniacdevelopment.serialization.DataModel;

/**
 * Created by larsg on 10/5/2016.
 */
public class EventNotificationPackage extends BasePackage {
    public EventNotificationPackage(){
        this.type = PackageType.NOTIFICATION_PACKAGE;
    }

    public String Id;

    public String Location;
}
