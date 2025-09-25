package com.example.demo;

public class PasswordValidator {
    public static final String WRONG_PASSWORD_LENGTH_MESSAGE = "비밀번호는 최소 8자 이상 12자 이하여야 한다.";

    public static void validate(String password) {
        int length = password.length();
        if(length < 8 || length > 12) {
            // throw new IllegalArgumentException("Password must be between 8 and 12 characters");
            throw new IllegalArgumentException(WRONG_PASSWORD_LENGTH_MESSAGE);
        }
    }
}
