package com.sos.auth.auth_sos.controllers.dto;

public record CreateUserDto(String name, String username, String password, String role) {
}