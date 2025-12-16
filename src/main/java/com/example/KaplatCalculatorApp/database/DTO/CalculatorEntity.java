package com.example.KaplatCalculatorApp.database.DTO;


import jakarta.persistence.*;

@Entity
@Table(name = "operations")
public class CalculatorEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // This creates the sequential 1, 2, 3...
    private Integer rawid;
    private String flavor;
    private String operation;
    private Integer result;
    private String arguments; // Stored as JSON string


    // Getters and Setters


    public Integer getRawid() {
        return rawid;
    }

    public void setRawid(Integer rawid) {
        this.rawid = rawid;
    }

    public String getFlavor() {
        return flavor;
    }

    public void setFlavor(String flavor) {
        this.flavor = flavor;
    }

    public String getOperation() {
        return operation;
    }

    public void setOperation(String operation) {
        this.operation = operation;
    }

    public Integer getResult() {
        return result;
    }

    public void setResult(Integer result) {
        this.result = result;
    }

    public String getArguments() {
        return arguments;
    }

    public void setArguments(String arguments) {
        this.arguments = arguments;
    }
}
