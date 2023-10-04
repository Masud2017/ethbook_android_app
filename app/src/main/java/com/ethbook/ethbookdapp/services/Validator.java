package com.ethbook.ethbookdapp.services;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Validator {
    private static Pattern usernamePattern = Pattern.compile("(\\s)|(^_)|(^\\d)"); // this will contain the pattern to detect invalid username

    private static boolean usernameMatcherFlag = false;

    public static boolean isUserNameValid(String username) {
        Matcher usernameMatcher = usernamePattern.matcher(username);

        while(usernameMatcher.find()) {
            usernameMatcherFlag = true;
        }

        if (usernameMatcherFlag == true) {
            return false;
        }


        return true;
    }
}
