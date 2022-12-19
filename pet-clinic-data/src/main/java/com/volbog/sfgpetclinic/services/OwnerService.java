package com.volbog.sfgpetclinic.services;


import com.volbog.sfgpetclinic.model.Owner;
import com.volbog.sfgpetclinic.model.Vet;

public interface OwnerService extends CrudService<Owner, Long> {
    Vet findByLastName(String lastName);


}
