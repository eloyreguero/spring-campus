package cern.spring.campus.calendar.controller;

import cern.spring.campus.calendar.domain.*;
import cern.spring.campus.calendar.service.ApiService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;

@RestController
@RequestMapping(consumes = APPLICATION_JSON_VALUE, produces = APPLICATION_JSON_VALUE)
public class ApiController {

    private final ApiService apiService;

    public ApiController(final ApiService apiService) {
        this.apiService = apiService;
    }

    @GetMapping(value = "speaker")
    public List<Speaker> getSpeakers() {
        return apiService.query(Speaker.class);
    }

    @GetMapping(value = "schedule")
    public List<Schedulable> getSchedule() {
        List<Schedulable> list = new ArrayList<>();
        list.addAll(apiService.query(Contribution.class));
        list.addAll(apiService.query(CoffeeBreak.class));
        list.addAll(apiService.query(SocialEvent.class));
        return list;
    }


}
