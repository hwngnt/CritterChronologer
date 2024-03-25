package com.udacity.jdnd.course3.critter.service;

import com.udacity.jdnd.course3.critter.model.Pet;
import java.util.List;

public interface PetService {
    Pet savePet(Pet Pet, Long customerId);
    Pet getPet(long petId);
    List<Pet> getPets();
    List<Pet> getPetsByOwner(long ownerId);
}
