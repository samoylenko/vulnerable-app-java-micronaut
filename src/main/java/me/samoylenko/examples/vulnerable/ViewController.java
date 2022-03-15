package me.samoylenko.examples.vulnerable;

import io.micronaut.http.HttpResponse;
import io.micronaut.http.annotation.*;
import io.micronaut.views.View;

import java.util.HashMap;
import java.util.Map;

@Controller("/view")
class ViewController {

    @View("hello")
    @Get
    HttpResponse<Map<String, String>> getView(@QueryValue String name) {
        Map<String, String> valueMap = new HashMap<>();
        valueMap.put("name", name);
        return HttpResponse.ok(valueMap);
    }
}
