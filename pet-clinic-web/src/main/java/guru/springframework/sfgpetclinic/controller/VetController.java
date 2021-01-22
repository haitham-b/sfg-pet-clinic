package guru.springframework.sfgpetclinic.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/vets")
@Controller
public class VetController {

    @RequestMapping({"", "/vet_index", "/vet_index.html"})
    public String listVets() {
        return "vets/vet_index";
    }
}
