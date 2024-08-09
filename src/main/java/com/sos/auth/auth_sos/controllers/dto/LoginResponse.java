package com.sos.auth.auth_sos.controllers.dto;

import java.util.Set;

import com.sos.auth.auth_sos.models.Role;

public record LoginResponse(String accessToken, Long expiresIn, String username, String name, Set<Role> roles) {
    
}
