package com.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by student on 4/20/17.
 */
@Controller
public class PeopleController {
    @Autowired
    private PersonRepository personRepository;

    @RequestMapping("/")
    public ModelAndView peopleList(){
        return new ModelAndView("people", "peopleList", personRepository.findAll());
    }
}
