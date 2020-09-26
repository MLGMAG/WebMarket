package ua.kpi.iasa.WebMarket.model;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.UUID;

public class Product {
    private UUID id;
    private String name;
    private String description;
    private BigDecimal price;
    private LocalDate addingDate;
    private Color color;
    private double size;

    public Product() {
    }

    public Product(UUID id, String name, String description, BigDecimal price, LocalDate addingDate, Color color, double size) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.price = price;
        this.addingDate = addingDate;
        this.color = color;
        this.size = size;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public LocalDate getAddingDate() {
        return addingDate;
    }

    public void setAddingDate(LocalDate addingDate) {
        this.addingDate = addingDate;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public double getSize() {
        return size;
    }

    public void setSize(double size) {
        this.size = size;
    }
}
