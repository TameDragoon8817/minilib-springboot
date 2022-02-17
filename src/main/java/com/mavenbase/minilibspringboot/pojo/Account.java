package com.mavenbase.minilibspringboot.pojo;

public class Account {
    private String UUID;
    private String role;
    private String name;
    private String password;
    private String timestamp;

    public Account(String UUID, String role, String name, String password, String timestamp) {
        this.UUID = UUID;
        this.role = role;
        this.name = name;
        this.password = password;
        this.timestamp = timestamp;
    }

    @Override
    public String toString() {
        return "Account{" +
                "UUID='" + UUID + '\'' +
                ", role='" + role + '\'' +
                ", name='" + name + '\'' +
                ", password='" + password + '\'' +
                ", timestamp='" + timestamp + '\'' +
                '}';
    }

    public String getUUID() {
        return UUID;
    }

    public void setUUID(String UUID) {
        this.UUID = UUID;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
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

    public String getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(String timestamp) {
        this.timestamp = timestamp;
    }
}
