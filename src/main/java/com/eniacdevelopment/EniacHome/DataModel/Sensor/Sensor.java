package com.eniacdevelopment.EniacHome.DataModel.Sensor;

import com.eniacdevelopment.EniacHome.DataModel.Entity;

/**
 * Created by larsg on 1/5/2017.
 */
public class Sensor extends Entity{
    public String Name;
    public SensorType SensorType;
    public Boolean Enabled;

    public SensorStatus SensorStatus;
}
