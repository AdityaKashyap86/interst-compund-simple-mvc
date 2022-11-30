package com.sunglowsys.controller;

import com.sunglowsys.domain.InterstCalculate;
import com.sunglowsys.service.InterstCalculateService;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

@RestController
@RequestMapping("/simple")
public class SimpleInterstController {
    private final InterstCalculateService service;

    public SimpleInterstController(InterstCalculateService service) {
        this.service = service;
    }


    @GetMapping("get-simple")
    public ModelAndView getSimple() {
        return new ModelAndView("simpleInterest", "interest", new InterstCalculate());
    }

    @PostMapping("/get-form")
    public ModelAndView simpleInterest(@ModelAttribute InterstCalculate calculate) {
        return new ModelAndView("simpleInterest", "interest",service.simplInterstCalculate(calculate));

    }
}
