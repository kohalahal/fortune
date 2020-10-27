package org.hal.fortune.controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.hal.fortune.model.Fortune;
import org.hal.fortune.service.FortuneService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FortuneController {

    private final FortuneService service;

    public FortuneController(FortuneService service) {
        this.service = service;
    }

    @GetMapping("/fortune")
    String get() {
        ObjectMapper mapper = new ObjectMapper();
        String json = "";
        try {
            json = mapper.writeValueAsString(service.getRandom());
            System.out.println("ResultingJSONstring = " + json);
            //System.out.println(json);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }
        return json;
    }

    @PostMapping("/fortune")
    Fortune newFortune(@RequestBody Fortune newFortune) {
        return service.save(newFortune);
    }

}