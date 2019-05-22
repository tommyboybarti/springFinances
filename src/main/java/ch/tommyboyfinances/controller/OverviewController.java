package ch.tommyboyfinances.controller;

import java.util.concurrent.atomic.AtomicLong;

import ch.tommyboyfinances.finances.Overview;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OverviewController {
    private static final String template = "This is %s";
    private final AtomicLong counter = new AtomicLong();

    @RequestMapping("/overview")
    public Overview overview(@RequestParam(value="name", defaultValue="none") String name) {
        return new Overview(counter.incrementAndGet(), String.format(template, name));
    }
}