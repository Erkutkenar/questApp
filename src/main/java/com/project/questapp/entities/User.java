package com.project.questapp.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name="user")
public class User {

    @Id
    private Long id;

    @Getter
    @Setter
    private String userName;
    @Getter
    @Setter
    private String password;

}
