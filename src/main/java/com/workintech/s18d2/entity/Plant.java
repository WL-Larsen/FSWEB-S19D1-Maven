package com.workintech.s18d2.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.DecimalMin;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@MappedSuperclass
public abstract class Plant {

    //*****************
    @org.springframework.data.annotation.Transient
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "name")
    @NotNull(message = "name cannot be  null")
    @Size(min = 2, max = 45, message = ":Name size must be betwen 2 to 45")
    private String name;

    @Column(name = "price")
    @DecimalMin("10")
    private Double price;
}
