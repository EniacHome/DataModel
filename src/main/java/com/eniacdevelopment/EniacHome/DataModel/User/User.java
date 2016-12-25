package com.eniacdevelopment.EniacHome.DataModel.User;

import com.eniacdevelopment.EniacHome.DataModel.Entity;

import java.util.List;

/**
 * Created by larsg on 12/9/2016.
 */
public class User extends Entity {

    public String Username;
    public String PasswordHash;

    public String Firstname;
    public String Lastname;

    public List<UserRole> Roles;
}
