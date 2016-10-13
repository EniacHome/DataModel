package com.eniacdevelopment.eniachome.DataModel;

/**
 * Created by larsg on 10/5/2016.
 */

import com.fasterxml.jackson.annotation.JsonValue;

public enum PackageType {
    NOTIFICATION_PACKAGE(Constants.NOTIFICATION),
    USER_PACKAGE(Constants.USER),
    ALARM_STATUS_PACKAGE(Constants.ALARM_STATUS);

    private String value;

    @JsonValue
    private String getValue(){
        return this.value;
    }

    PackageType(String value) {
        this.value = value;
    }

    public static class Constants {
        public static final String NOTIFICATION = "NotificationPackage";
        public static final String USER = "UserPackage";
        public static final String ALARM_STATUS = "AlarmStatusPackage";
    }
}
