package ru.alishev.springcourse.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import ru.alishev.springcourse.dao.PersonDAO;

@Controller
@RequestMapping("/test")
public class BatchController {
    private final PersonDAO personDAO;
    @Autowired
    public BatchController(PersonDAO personDAO) {
        this.personDAO = personDAO;
    }


    @GetMapping()
    public String index() {
        return "batch/index";
    }

//    @GetMapping("/without")
//    public String withoutBath() {
//        personDAO.testMultipleUpdate();
//        return "redirect:/people";
//    }
//
//    @GetMapping("/with")
//    public String withBath() {
//        personDAO.testBathUpdate();
//        return "redirect:/people";
//    }

}
