package com.kinath.demo.entity;

public class User
{
    private long userId;
    private String userName;
    private String email;
    private String phoneNumber;

    public User()
    {
    }

    public User( String userName, String email, String phoneNumber )
    {
        this.userName = userName;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    public long getUserId()
    {
        return userId;
    }

    public void setUserId( long userId )
    {
        this.userId = userId;
    }

    public String getUserName()
    {
        return userName;
    }

    public void setUserName( String userName )
    {
        this.userName = userName;
    }

    public String getEmail()
    {
        return email;
    }

    public void setEmail( String email )
    {
        this.email = email;
    }

    public String getPhoneNumber()
    {
        return phoneNumber;
    }

    public void setPhoneNumber( String phoneNumber )
    {
        this.phoneNumber = phoneNumber;
    }
}
