package com.mareenraj.ems_backend.model;

import jakarta.persistence.*;
import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@Table(name = "employees")
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "employee_id")
    private Long id;

    @Column(nullable = false)
    private String firstName;

    private String lastName;

    @Column(name = "email_id", nullable = false, unique = true)
    private String email;
}
