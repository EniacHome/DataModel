package com.eniacdevelopment.serialization.DataModel;

/**
 * Created by larsg on 10/5/2016.
 */
public class EventNotification extends AbstractPackage{
    public EventNotification(){
        this.setType(com.eniacdevelopment.serialization.DataModel.PackageType.notification);
    }

    public String Id;

    public String Location;
}
