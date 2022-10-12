package com.example.atuserservice.data;

import lombok.Data;

@Data
public class User {
   // TODO: some form of ID, going to use Postgres
    String email;

    String password;
}
