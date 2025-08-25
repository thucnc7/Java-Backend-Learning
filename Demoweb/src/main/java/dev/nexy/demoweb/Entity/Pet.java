package dev.nexy.demoweb.Entity;

import lombok.Data;

@Data
public class Pet {
        private String name;
        private String petId;
        private Integer age;
        private String ownerName;
        private boolean isAdopted = false;
}
