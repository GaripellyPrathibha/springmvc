package com.java.cis;
import java.text.DecimalFormat;
import java.util.Locale;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import static java.lang.Math.round;

@Controller
public class BMIController {

    private static final DecimalFormat df = new DecimalFormat("0.00");
    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String input(Locale locale, Model model) {
        System.out.println("BMI calculater, locale = " + locale);
        return "input";
    }
    @RequestMapping(value = "/bmi", method = RequestMethod.POST)
    public String result(@RequestParam("height") double heightInInches,
                         @RequestParam("weight") double weightInPounds,
                         Model model) {

        double bmi = weightInPounds / (heightInInches * heightInInches) * 703;
        model.addAttribute("bmi", df.format(bmi));
        System.out.println(df.format(bmi));
        return "result";
    }
}
