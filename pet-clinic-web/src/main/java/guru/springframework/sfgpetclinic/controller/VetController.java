package guru.springframework.sfgpetclinic.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class VetController {

    @RequestMapping({"/vets", "/vets/vet_index", "/vets/vet_index.html"})
    public String listVets() {
        return "vets/vet_index";
    }
}
