package com.mconsulting.utils;

/*
 * Represents one RSS message
 */

public class FeedMessage {
    String name;
    String phonenumber;
    String designation;

    public String getName () {
        return name;
    }

    public void setName (String name) {
        this.name = name;
    }

    public String getPhonenumber () {
        return phonenumber;
    }

    public void setPhonenumber (String phonenumber) {
        this.phonenumber = phonenumber;
    }

    public String getDesignation () {
        return designation;
    }

    public void setDesignation (String designation) {
        this.designation = designation;
    }

    @Override
    public String toString() {
        return "FeedMessage [name=" + name + ", phonenumber=" + phonenumber + ", designation=" + designation + "]";
    }
}
