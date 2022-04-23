package com.bmtracking.motodey.models;

import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.time.LocalDateTime;
import java.util.Date;

@Entity
@Table(name = "countries")
public class Country {
    private static final long serialVersionUID = 7401548380514451401L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="id", columnDefinition = "VARCHAR(255)", insertable = false, updatable = false, nullable = false)
    private String id;

    @NotNull
    @Column(name="code", columnDefinition = "VARCHAR(255)", insertable = true, updatable = true, nullable = false, unique = true)
    private String code;

    @NotNull
    @Column(name="name", columnDefinition = "VARCHAR(255)", insertable = true, updatable = true, nullable = false, unique = true)
    private String name;

    @NotNull
    @CreatedDate
    @Column(name="createdAt")
    private Date createdAt;

    @LastModifiedDate
    @Column(name="updatedAt")
    private LocalDateTime updatedAt;

    @Column(name="deletedAt", nullable = true)
    private LocalDateTime deletedAt;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    public LocalDateTime getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(LocalDateTime updatedAt) {
        this.updatedAt = updatedAt;
    }

    public LocalDateTime getDeletedAt() {
        return deletedAt;
    }

    public void setDeletedAt(LocalDateTime deletedAt) {
        this.deletedAt = deletedAt;
    }

    @Override
    public String toString() {
        return "Country [id=" + id + ", code=" + code + ", name=" + name + ", createdAt=" + createdAt + ", updatedAt=" + updatedAt + ", deletedAt=" + deletedAt + "]";
    }
}
