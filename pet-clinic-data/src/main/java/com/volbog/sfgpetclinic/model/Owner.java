package com.volbog.sfgpetclinic.model;

import lombok.Getter;
import lombok.Setter;

import java.util.Set;

@Getter
@Setter
public class Owner extends Person {

    private String Address;
    private String city;
    private String telephone;
    private Set<Pet> pets;
}
