package at.technikum.slmExam.controller;

import at.technikum.slmExam.service.FactorialService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/factorial")
public class FactorialController {

    @Autowired
    private FactorialService factorialService;

    @GetMapping
    public long getFactorial(@RequestParam("number") int number) {
        return factorialService.calculateFactorial(number);
    }
}