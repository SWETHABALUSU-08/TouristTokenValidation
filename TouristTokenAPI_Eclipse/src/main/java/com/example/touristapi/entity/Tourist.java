package com.example.touristapi.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "tourists")
public class Tourist {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String email;
    private String place;

    public Tourist() {}

    public Tourist(String name, String email, String place) {
        this.name = name;
        this.email = email;
        this.place = place;
    }

    public Long getId() { return id; }
    public String getName() { return name; }
    public String getEmail() { return email; }
    public String getPlace() { return place; }
    public void setId(Long id) { this.id = id; }
    public void setName(String name) { this.name = name; }
    public void setEmail(String email) { this.email = email; }
    public void setPlace(String place) { this.place = place; }
}
