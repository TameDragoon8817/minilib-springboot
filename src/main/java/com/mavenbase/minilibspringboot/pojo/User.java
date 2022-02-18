package com.mavenbase.minilibspringboot.pojo;

public class User {
    private String UUID;
    private String name;
    private String password;
    private String role;
    private String timestamp;

    @Override
    public String toString() {
        return "User{" +
                "UUID='" + UUID + '\'' +
                ", name='" + name + '\'' +
                ", password='" + password + '\'' +
                ", role='" + role + '\'' +
                ", timestamp='" + timestamp + '\'' +
                '}';
    }

    public User() {
    }

    public User(String UUID, String name, String password, String role, String timestamp) {
        this.UUID = UUID;
        this.name = name;
        this.password = password;
        this.role = role;
        this.timestamp = timestamp;
    }

    public String getUUID() {
        return UUID;
    }

    public void setUUID(String UUID) {
        this.UUID = UUID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(String timestamp) {
        this.timestamp = timestamp;
    }
}