package com.sunglowsys.controller;

import com.sunglowsys.domain.InterstCalculate;
import com.sunglowsys.service.InterstCalculateService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/compound")
public class compoundinterstController {
    private final InterstCalculateService calculateService;

    public compoundinterstController(InterstCalculateService calculateService) {
        this.calculateService = calculateService;
    }

    @GetMapping("/calculate")
    public ModelAndView getCompound () {
        return new ModelAndView("compoundInterest", "interest", new InterstCalculate());
    }
    @PostMapping("/calculate")
    public ModelAndView compoundInterst(@ModelAttribute InterstCalculate calculate) {
        return new ModelAndView("compoundInterest", "interest", calculateService.compoundInterstCalculate(calculate));
    }
}
