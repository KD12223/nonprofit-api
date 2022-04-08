package com.kylerdeggs.nonprofitapi.domain;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "adoption")
public class Adoption {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "pet_name", nullable = false)
    private String petName;

    @Column(name = "pet_type", nullable = false)
    private String petType;

    @Column(name = "description", nullable = false)
    private String description;

    @Column(name = "adopter_name")
    private String adopterName;

    @Column(name = "adoption_date")
    private LocalDateTime adoptionDate;

    public Adoption() {

    }

    public Adoption(int id, String petName, String petType, String description, String adopterName,
                    LocalDateTime adoptionDate) {
        this.id = id;
        this.petName = petName;
        this.petType = petType;
        this.description = description;
        this.adopterName = adopterName;
        this.adoptionDate = adoptionDate;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPetName() {
        return petName;
    }

    public void setPetName(String petName) {
        this.petName = petName;
    }

    public String getPetType() {
        return petType;
    }

    public void setPetType(String petType) {
        this.petType = petType;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getAdopterName() {
        return adopterName;
    }

    public void setAdopterName(String adopterName) {
        this.adopterName = adopterName;
    }

    public LocalDateTime getAdoptionDate() {
        return adoptionDate;
    }

    public void setAdoptionDate(LocalDateTime adoptionDate) {
        this.adoptionDate = adoptionDate;
    }
}
