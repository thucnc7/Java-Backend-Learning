package dev.nexy.demoweb.RestController;

import dev.nexy.demoweb.Entity.Pet;
import dev.nexy.demoweb.dto.AssignPet;
import dev.nexy.demoweb.dto.CreatePet;
import org.springframework.web.bind.annotation.*;

import java.util.Vector;

@RestController
@RequestMapping("/api/v1/pets")

public class Controller {


    git rm --cachedgit rm --cachedpublic static Vector<Pet> PetList = new Vector<Pet>();


    @PostMapping

    public Pet CreatePet(@RequestBody CreatePet RequestPet) {
        Pet pet = new Pet();
        pet.setPetId(RequestPet.getPetId());
        pet.setName(RequestPet.getName());
        pet.setAge(RequestPet.getAge());
        PetList.add(pet);
        return pet;
    }


    @GetMapping("/petList")

    public Vector<Pet> GetPetList()
    {
        return PetList;
    }

    private Pet findPet(String index){
        for(Pet PetEntity : PetList){
            if(PetEntity.getPetId().equals(index)){
                return PetEntity;
            }
        }
        return null;
    }
    @GetMapping("/{PetId}")

    public Pet GetPet(@PathVariable String PetId){
        return findPet(PetId);
    }

    @PutMapping("/assignPet")

    public Pet AssignPet(@RequestBody AssignPet RequestPet) {
        Pet pet = findPet(RequestPet.getPetId());
        pet.setOwnerName(RequestPet.getOwnerName());
        pet.setAdopted(true);
        return pet;
    }
}
