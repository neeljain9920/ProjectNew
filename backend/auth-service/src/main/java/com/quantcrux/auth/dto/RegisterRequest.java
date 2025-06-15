package com.quantcrux.auth.dto;

import com.quantcrux.auth.entity.Role;

public class RegisterRequest {
    private String username;
    private String email;
    private String password;
    private Role role;
    private String name;
    
    // Constructors
    public RegisterRequest() {}
    
    public RegisterRequest(String username, String email, String password, Role role, String name) {
        this.username = username;
        this.email = email;
        this.password = password;
        this.role = role;
        this.name = name;
    }
    
    // Getters and Setters
    public String getUsername() { return username; }
    public void setUsername(String username) { this.username = username; }
    
    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }
    
    public String getPassword() { return password; }
    public void setPassword(String password) { this.password = password; }
    
    public Role getRole() { return role; }
    public void setRole(Role role) { this.role = role; }
    
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
}