package ua.kpi.iasa.WebMarket.model;

import java.math.BigDecimal;
import java.util.List;
import java.util.UUID;

public class User {
    private UUID id;
    private String firstName;
    private String lastName;
    private List<Order> orders;
    private BigDecimal balance;
    private Bucket bucket;
    private Role role;

    public User() {
    }

    public User(UUID id, String firstName, String lastName, List<Order> orders, BigDecimal balance, Bucket bucket, Role role) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.orders = orders;
        this.balance = balance;
        this.bucket = bucket;
        this.role = role;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public List<Order> getOrders() {
        return orders;
    }

    public void setOrders(List<Order> orders) {
        this.orders = orders;
    }

    public BigDecimal getBalance() {
        return balance;
    }

    public void setBalance(BigDecimal balance) {
        this.balance = balance;
    }

    public Bucket getBucket() {
        return bucket;
    }

    public void setBucket(Bucket bucket) {
        this.bucket = bucket;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }
}
