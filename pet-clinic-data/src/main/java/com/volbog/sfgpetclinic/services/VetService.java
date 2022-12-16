package com.volbog.sfgpetclinic.services;

import com.volbog.sfgpetclinic.model.Owner;

import java.util.Set;

public interface VetService {
    Owner findById(Long id);

    Owner findByLastName(String lastName);

    Owner save(Owner owner);

    Set<Owner> findAll();
}
