package com.example.demo.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "car")
public class CarEntity {
    @Id
    private String id;
    private String model;
    private String color;

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof CarEntity)) return false;

        CarEntity other = (CarEntity) obj;
        return model.equals(other.model);
    }

    @Override
    public int hashCode() {
        return model.hashCode();
    }
}
