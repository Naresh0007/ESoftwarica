package com.naresh.esoftwarica.controller;

import com.naresh.esoftwarica.model.UserData;

public class controller {
    public boolean CheckUser(UserData sd) {
        if ((sd.getName().equals("naresh")) && (sd.getPassword().equals("pass"))) {
            return true;

        } else {
            return false;
        }
    }
}
