package guru.springframework.sfgpetclinic.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/owners")
@Controller
public class OwnerController {

    @RequestMapping({"", "/owner_index", "/owner_index.html"})
    public String listOwners(Model model) {
//        model.addAttribute("allOwners", owner.find)
        return "owners/owner_index";
    }
}
