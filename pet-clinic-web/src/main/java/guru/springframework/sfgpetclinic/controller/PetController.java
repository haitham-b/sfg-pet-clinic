package guru.springframework.sfgpetclinic.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/pets")
@Controller
public class PetController {

    @RequestMapping({"", "/vet_index", "/vet_index.html"})
    public String listVets() {
        return "vets/vet_index";
    }
}
