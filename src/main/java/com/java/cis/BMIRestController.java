package com.java.cis;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
@RestController
@RequestMapping("/bmirest")
public class BMIRestController {

    @RequestMapping(method = {RequestMethod.GET, RequestMethod.POST})
    public String calculateBMI(@RequestParam("height") double heightInches, @RequestParam("weight") double weightLbs) {
        return calculateBMIValue(heightInches, weightLbs);
    }
    private String calculateBMIValue(double heightInches, double weightLbs) {
        double heightMeters = heightInches * 0.0254;
        double weightKg = weightLbs * 0.453592;
        double bmi = weightKg / (heightMeters * heightMeters);
        bmi = Math.round(bmi * 100.0) / 100.0;
        return Double.toString(bmi);
    }
}