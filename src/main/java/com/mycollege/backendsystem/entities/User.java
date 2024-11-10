package com.mycollege.backendsystem.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name="Users")
@NoArgsConstructor
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Getter
    private long id;

    @Getter @Setter
    @Column(name = "first_name")
    private String firstName;

    @Getter @Setter
    @Column(name = "last_name")
    private String lastName;

}
