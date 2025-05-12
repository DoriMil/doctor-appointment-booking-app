package com.dorotamiler.doctor_appointment_booking_app;

import jakarta.persistence.*;

import java.time.Instant;
import java.util.ArrayList;
import java.util.List;

public class ClientEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "client_seq")
    @SequenceGenerator(name = "client_seq", sequenceName = "client_seq")
    private Long id;

    @Version
    private int version;
    private Instant created;
    private Instant lastUpdated;

    @OneToOne
    @JoinColumn(name = "user_id", nullable = false)
    private UserEntity user;

    @OneToMany(mappedBy = "client", cascade = CascadeType.ALL)
    List<AppointmentEntity> appointments = new ArrayList<>();

}
