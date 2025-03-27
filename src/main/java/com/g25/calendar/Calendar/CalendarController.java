package com.g25.calendar.Calendar;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping(path = "calendar")
public class CalendarController {

    @GetMapping
    public String startUp() {
        return "Calendar";
    }
}
