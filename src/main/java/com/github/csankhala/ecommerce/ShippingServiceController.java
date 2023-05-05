package com.github.csankhala.ecommerce;

import io.micronaut.http.annotation.*;

@Controller("/shippingService")
public class ShippingServiceController {

    @Get(uri="/", produces="text/plain")
    public String index() {
        return "Example Response";
    }
}