package com.volbog.sfgpetclinic.services;

import com.volbog.sfgpetclinic.model.Person;
import com.volbog.sfgpetclinic.model.Vet;

public interface VetService<V extends Person, L extends Number> extends CrudService<Vet, Long> {
    Vet findById(Long aLong);

    Vet save(Vet object);

    void delete(Vet object);

    void deleteById(Long aLong);
}
