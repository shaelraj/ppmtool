package com.javamonks.payload;

import lombok.Data;

@Data
public class JWTLoginSucessReponse {
    private boolean success;
    private String token;

    public JWTLoginSucessReponse(boolean success, String token) {
        this.success = success;
        this.token = token;
    }

}
