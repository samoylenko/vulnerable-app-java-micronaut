package me.samoylenko.examples.vulnerable;

import io.micronaut.http.MediaType;
import io.micronaut.http.annotation.*;

@Controller("/hello")
class HelloController {

    @Get
    @Produces(MediaType.TEXT_HTML)
    String getName(@QueryValue String name) {
        return "Hello, " + name;
    }
}
