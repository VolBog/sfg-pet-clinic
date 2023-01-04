package com.volbog.sfgpetclinic.repositories;

import com.volbog.sfgpetclinic.model.Pet;
import org.springframework.data.repository.CrudRepository;

public interface PetRepository extends CrudRepository<Pet, Long> {
}
