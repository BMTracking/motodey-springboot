package com.bmtracking.motodey.models;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import jdk.jfr.Timestamp;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.UUID;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "activities")
public class Activity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="id", columnDefinition = "VARCHAR(255)", insertable = false, updatable = false, nullable = false)
    private String id;

    @NotNull
    @Column(name="name", columnDefinition = "VARCHAR(255)", insertable = true, updatable = true, nullable = false)
    private String name;


    @Column(name="description", columnDefinition = "VARCHAR(255)", insertable = true, updatable = true, nullable = true)
    private String description;

    @NotNull
    @CreatedDate
    @Column(name="createdAt")
    private Date createdAt;

    @LastModifiedDate
    @Column(name="updatedAt")
    private LocalDateTime updatedAt;

    @Column(name="deletedAt", nullable = true)
    private LocalDateTime deletedAt;



    @Override
    public String toString() {
        return "City [id=" + id + ", name=" + name + ", description=" + description + ", createdAt=" + createdAt + ", updatedAt=" + updatedAt + ", deletedAt=" + deletedAt + "]";
    }
}
