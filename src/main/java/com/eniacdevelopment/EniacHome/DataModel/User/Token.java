package com.eniacdevelopment.EniacHome.DataModel.User;

import com.eniacdevelopment.EniacHome.DataModel.Entity;

import java.util.Date;

/**
 * Created by larsg on 12/10/2016.
 */
public class Token extends Entity {
    public Date ExpiryDate;
    public String Token;
}
