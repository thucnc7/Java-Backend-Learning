package dev.nexy.demoweb.dto;

import lombok.Data;

@Data
public class CreatePet {
    private String name;
    private String petId;
    private Integer age;
    private boolean isAdopted = false;
}
