package com.rahul.filterDemo.dto;

public class StudentResponseDTO {
    private String name;
    private String message;

    public StudentResponseDTO(){

    }

    public StudentResponseDTO(String name, String message) {
        this.name = name;
        this.message = message;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
