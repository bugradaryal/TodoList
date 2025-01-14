package com.Entities;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name= "id")
    private Integer id;
    @Column(name= "name", nullable = false, length = 50)
    private String name;
    @Column(name= "surname", nullable = false, length = 50)
    private String surname;
    @Column(name= "username", nullable = false, length = 24)
    private String username;
    @Column(name= "password", nullable = false, length = 16)
    private String password;
    @Column(name= "email", nullable = false, length = 92, unique = true)
    private String email;

    @OneToMany(mappedBy = "user")
    @JsonManagedReference
    private List<Todo> todo;
}
