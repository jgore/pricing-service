package pl.goreit.pricingservice.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigDecimal;

@RestController
@RequestMapping(value = "/calculate")
public class PricingController {

    @Value("vat")
    public String vat;

    @RequestMapping(value = "/{id}")
    public BigDecimal calculatePrice()
    {
        return new BigDecimal(vat);
    }
}
