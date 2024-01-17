package cat.itacademy.barcelonactiva.gomez.marbelys.s04.t01.n02.S04T01N02GomezMarbelys.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {
    @GetMapping("/HelloWorld")
    public String greeting(@RequestParam(name = "Mar", defaultValue = "UNKNOWN") String name) {
        return "Hello, " + name + ". You are running a Maven project.";
    }
    @GetMapping({"/HelloWorld2/{name}"})
    public String greeting2(@PathVariable(name = "Lola", required = false) String name) {
        if (name == null) {
            name = "UNKNOWN";
        }
        return "Hello, " + name + ". You are running a Maven project.";
    }
}
