package com.validation.model;

import java.time.LocalDateTime;

public class Request {

    private Long id;

    private Long userId;

    private LocalDateTime createdDate;


    public Request(Long id, Long userId, LocalDateTime createdDate) {
        this.id = id;
        this.userId = userId;
        this.createdDate = createdDate;
    }

    public Request() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public LocalDateTime getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(LocalDateTime createdDate) {
        this.createdDate = createdDate;
    }
}
