package com.example.demo;

import javax.persistence.*;
import java.util.Set;

@Entity
public class Car {
@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
private long id;
    private String manufacturer;
    private String model;
    private long year;
    private double msrp;
    private String category;

    @OneToMany(mappedBy = "car", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    public Set<Category> categories;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public long getYear() {
        return year;
    }

    public void setYear(long year) {
        this.year = year;
    }

    public double getMsrp() {
        return msrp;
    }

    public void setMsrp(double msrp) {
        this.msrp = msrp;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public Set<Category> getCategories() {
        return categories;
    }

    public void setCategories(Set<Category> categories) {
        this.categories = categories;
    }
}
