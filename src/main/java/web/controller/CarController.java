package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import web.service.CarService;

import javax.print.attribute.standard.PresentationDirection;

@Controller
@RequestMapping(value = "/cars")
public class CarController {
    private final CarService carDAO;

    public CarController(CarService carDAO){this.carDAO = carDAO;}

//    @GetMapping(value = "")
//    public String getAllCars(Model model) {
//        model.addAttribute("cars", carDAO.getAllCars());
//
//        return "cars";
//    }

    @GetMapping(value = "")
    public String getCars(@RequestParam(value = "count", required = false) Integer count, Model model) {
        if(count == null) count = 5;
        model.addAttribute("cars", carDAO.getCars(count));
        return "cars";
    }

}
