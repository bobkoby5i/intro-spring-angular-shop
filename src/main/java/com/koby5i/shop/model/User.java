package com.koby5i.shop.model;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "users")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column (name = "names")
    private String name;

    @Column (name = "username")
    private String username;

    @Column (name = "password")
    private String password;

    @Enumerated(EnumType.STRING)
    @Column (name = "role")
    private Role role;

    @Transient
    private String token;

}
