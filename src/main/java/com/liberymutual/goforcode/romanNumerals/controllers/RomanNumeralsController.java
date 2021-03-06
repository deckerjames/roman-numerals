// RomanNumeralsController.java
package com.liberymutual.goforcode.romanNumerals.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.liberymutual.goforcode.romanNumerals.services.HinduToRomanNumeralConverter;

@Controller
@RequestMapping("/")
public class RomanNumeralsController {

    private HinduToRomanNumeralConverter converter;

    public RomanNumeralsController() {
        converter = new HinduToRomanNumeralConverter();
    }

    @GetMapping("")
    public String showDefaultPage() {
        return "romanNumerals/default";
    }

    @PostMapping("")
    public ModelAndView convertNumber(int numberToConvert) {
        String result;
		ModelAndView mv;
		try {
			result = converter.convert(numberToConvert);
			mv = new ModelAndView("romanNumerals/default");
		} catch (Exception e) {
			result = "message";
			mv = new ModelAndView("romanNumerals/default");
			
		}
        mv.addObject("conversion", result);
        return mv;
    }

}

