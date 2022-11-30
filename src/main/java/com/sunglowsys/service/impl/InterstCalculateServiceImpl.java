package com.sunglowsys.service.impl;

import com.sunglowsys.domain.InterstCalculate;
import com.sunglowsys.service.InterstCalculateService;
import org.springframework.stereotype.Service;

@Service
public class InterstCalculateServiceImpl implements InterstCalculateService {
    @Override
    public InterstCalculate simplInterstCalculate(InterstCalculate calculate) {
        double simpleInterest = (calculate.getPrincipleAmount() * calculate.getRateOfInterst() * calculate.getDuration())/100;
        double result = simpleInterest+calculate.getPrincipleAmount();
        calculate.setPrincipleAmount(result);
        return calculate;
    }

    @Override
    public InterstCalculate compoundInterstCalculate(InterstCalculate calculate) {
        double compoundInterest = (calculate.getPrincipleAmount()
                * Math.pow((1 + calculate.getRateOfInterst()/100),calculate.getDuration()))
                -calculate.getPrincipleAmount();
        double result = compoundInterest+calculate.getPrincipleAmount();
        calculate.setPrincipleAmount(result);
        return calculate;
    }
}