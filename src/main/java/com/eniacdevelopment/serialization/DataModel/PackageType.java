package com.eniacdevelopment.serialization.DataModel;

/**
 * Created by larsg on 10/5/2016.
 */
public enum PackageType {
    notification(Constants.NOTIFICATION),
    request(Constants.REQUEST);

    PackageType(String value) {
    }

    public static class Constants {
        public static final String NOTIFICATION = "notification";
        public static final String REQUEST = "request";
    }
}
