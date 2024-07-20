package com.sos.auth.auth_sos.controllers.dto;

public record LoginResponse(String accessToken, Long expiresIn, String username, String name) {
    
}
