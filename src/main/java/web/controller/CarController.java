package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.Service.CarService;

@Controller
public class CarController {
    
    private CarService carService;
    
    @Autowired
    public CarController(CarService carService) {
        this.carService = carService;
    }
    
    @GetMapping("/cars")
    public String howAllCars(@RequestParam(value = "cars_quantity",
            required = false, defaultValue = "5") Integer cars_Quantity, Model model) {
        model.addAttribute("carsList",
                carService.getCarsList(cars_Quantity));
        return "cars";
    }
}