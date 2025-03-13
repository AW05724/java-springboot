package com.example.demo.repository.mapper;

import java.time.LocalDateTime;

public class User {
    private Integer id;
    private String mail;
    private String password;
    private String roles;
    private LocalDateTime created;
    private LocalDateTime lastLogined;
    private Boolean enabled;

    // ゲッター、セッター、コンストラクタなどは省略
    // Lombokを使用する場合は、@Dataアノテーションなどを利用する
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getRoles() {
        return roles;
    }

    public void setRoles(String roles) {
        this.roles = roles;
    }

    public LocalDateTime getCreated() {
        return created;
    }

    public void setCreated(LocalDateTime created) {
        this.created = created;
    }

    public LocalDateTime getLastLogined() {
        return lastLogined;
    }

    public void setLastLogined(LocalDateTime lastLogined) {
        this.lastLogined = lastLogined;
    }

    public Boolean getEnabled() {
        return enabled;
    }

    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }
}
