package com.example.atuserservice.data;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity(name = "Users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    public void setId(Long id) {
        this.id = id;
    }
    private String email;
    private String password;
}
