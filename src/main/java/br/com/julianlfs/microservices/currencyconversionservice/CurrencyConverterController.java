package br.com.julianlfs.microservices.currencyconversionservice;

import br.com.julianlfs.microservices.currencyconversionservice.domain.CurrencyConversionBean;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigDecimal;

@RestController
public class CurrencyConverterController {

    @GetMapping("currency-converter/from/{from}/to/{to}/quantity/{quantity}")
    public CurrencyConversionBean convertCurrency(@PathVariable("from") String from,
                                                  @PathVariable("to") String to,
                                                  @PathVariable("quantity") BigDecimal quantity) {

        return new CurrencyConversionBean(1L, from, to, BigDecimal.ONE, quantity, quantity, 0);

    }

}
