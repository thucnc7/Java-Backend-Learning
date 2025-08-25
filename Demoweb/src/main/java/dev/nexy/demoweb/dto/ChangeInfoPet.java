package dev.nexy.demoweb.dto;

import lombok.Data;

@Data
public class ChangeInfoPet {
    private String name;
    private boolean isAdopted ;
    private Integer age;
}
