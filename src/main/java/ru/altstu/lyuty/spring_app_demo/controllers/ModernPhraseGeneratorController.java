package ru.altstu.lyuty.spring_app_demo.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.altstu.lyuty.spring_app_demo.core.BusinessLogic;

@RestController
public class ModernPhraseGeneratorController {
    final BusinessLogic logic;

    public ModernPhraseGeneratorController(BusinessLogic logic) {
        this.logic = logic;
    }

    @RequestMapping("/")
    public String greet() {
        return String.format("Hello from %s!", getClass().getSimpleName());
    }
    @RequestMapping("/modern")
    public String modern() {
        return logic.getModernPhrase();
    }
}
