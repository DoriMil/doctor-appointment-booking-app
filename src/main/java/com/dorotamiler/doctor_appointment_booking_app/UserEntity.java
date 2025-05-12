package com.dorotamiler.doctor_appointment_booking_app;

import jakarta.persistence.*;

import java.time.Instant;

public class UserEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "user_seq")
    @SequenceGenerator(name = "user_seq", sequenceName = "user_seq")
    private Long id;

    @Version
    private int version;

    private Instant created;
    private Instant lastUpdated;

    @Column(unique = true, nullable = false)
    private String email;

    @Column(name = "password_hash", nullable = false)
    private String passwordHash;

    private String firstName;
    private String lastName;
}
