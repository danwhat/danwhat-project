package com.danwhat.projeto.model;

import lombok.*;
import org.springframework.stereotype.Component;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@Entity
@AllArgsConstructor
@Table(name = "users")
public class User {

    @Id
    Long id;

    String username;

    String password;
}
