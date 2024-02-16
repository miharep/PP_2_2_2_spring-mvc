package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.Service.CarService;

@Controller
public class CarController {
    
    private final CarService carService;
    
    @Autowired
    public CarController(CarService carService) {
        this.carService = carService;
    }
    
    @GetMapping("/cars")
    public String howAllCars(@RequestParam(value = "count",
            required = false, defaultValue = "5") Integer count, Model model) {
        model.addAttribute("carsList",
                carService.getCarsList(count));
        return "cars";
    }
}