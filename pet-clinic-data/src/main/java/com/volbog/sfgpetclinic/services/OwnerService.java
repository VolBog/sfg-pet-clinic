package com.volbog.sfgpetclinic.services;


import com.volbog.sfgpetclinic.model.Vet;

import java.util.Set;

public interface OwnerService {
    Vet findById(Long id);

    Vet findByLastName(String lastName);

    Vet save(Vet vet);

    Set<Vet> findAll();

}
