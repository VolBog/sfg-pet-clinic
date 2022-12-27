package com.volbog.sfgpetclinic.services;


import com.volbog.sfgpetclinic.model.Owner;
import com.volbog.sfgpetclinic.model.Person;

public interface OwnerService<O extends Person, L extends Number> extends CrudService<Owner, Long> {
    Owner findByLastName(String lastName);


}
