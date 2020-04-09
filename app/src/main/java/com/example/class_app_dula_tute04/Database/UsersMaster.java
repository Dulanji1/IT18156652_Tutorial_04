package com.example.class_app_dula_tute04.Database;

import android.provider.BaseColumns;

public final class UsersMaster {

    // Constructor
    private UsersMaster() {
    };

    // Inner class that defines the table contents
    public static class Users implements BaseColumns {
        public static final String TABLE_NAME = "users";
        public static final String COLUMN_NAME_USERNAME = "username";
        public static final String COLUMN_NAME_PASSWORD = "password";
    }
}
