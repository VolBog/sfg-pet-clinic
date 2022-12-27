package com.volbog.sfgpetclinic.bootstrap;

import com.volbog.sfgpetclinic.model.Owner;
import com.volbog.sfgpetclinic.model.Vet;
import com.volbog.sfgpetclinic.services.OwnerService;
import com.volbog.sfgpetclinic.services.VetService;
import com.volbog.sfgpetclinic.services.map.OwnerServiceMap;
import com.volbog.sfgpetclinic.services.map.VetServiceMap;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements CommandLineRunner {

    private final OwnerService<Owner, Long> ownerService;
    private final VetService<Vet, Long> vetService;
    //  private final PetService<Pet, Long> petService;

    public DataLoader() {
        ownerService = new OwnerServiceMap();
        vetService = new VetServiceMap();
        // petService = new PetServiceMap();
    }

    @Override
    public void run(String... args) throws Exception {
        Owner owner1 = new Owner();
        owner1.setFirstName("Michael");
        owner1.setLastName("Weston");

        ownerService.save(owner1);

        Owner owner2 = new Owner();
        owner2.setFirstName("Fiona");
        owner2.setLastName("Glenanne");

        ownerService.save(owner2);

        System.out.println("Loaded Owners....");

        Vet vet1 = new Vet();
        vet1.setFirstName("Sam");
        vet1.setLastName("Axe");

        vetService.save(vet1);

        Vet vet2 = new Vet();
        vet2.setFirstName("Jessie");
        vet2.setLastName("Porter");

        vetService.save(vet2);

        System.out.println("Loaded Vets....");

    }
}
