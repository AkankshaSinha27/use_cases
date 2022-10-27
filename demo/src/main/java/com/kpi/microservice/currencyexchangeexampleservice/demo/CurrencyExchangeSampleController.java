package com.kpi.microservice.currencyexchangeexampleservice.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CurrencyExchangeSampleController {

	@GetMapping("/currency-converter/from/{from}/to/{to}/quantity/{quantity}")
	public CurrencyConversionSampleBean convertCurrency(@PathVariable String from, @PathVariable String to,
			@PathVariable Double quantity) {

		final String currency1 = "Rupee";
		final String currency2 = "USD";
		final String currency3 = "Yen";
		final String currency4 = "Euro";
		final String currency5 = "Riel";
		final String currency6 = "Yuan";
		final String currency7 = "Taka";

		double per = 0;
		double mul = 0;
		if (from.equals(currency1)) {

			if (to.equals(currency2)) {
				mul = 6.8;
				per = quantity * mul;

			}
			if (to.equals(currency3)) {
				mul = 78.9;
				per = quantity * mul;

			}
			if (to.equals(currency4)) {
				mul = 8.9;
				per = quantity * mul;

			}
			if (to.equals(currency5)) {
				mul = 56.9;
				per = quantity * mul;

			}
			if (to.equals(currency6)) {
				mul = 0.92;
				per = quantity * mul;

			} else if (to.equals(currency7)) {
				mul = 5.98;
				per = quantity * mul;
			}
		}

		return new CurrencyConversionSampleBean(1L, from, to, mul, quantity, per, (double) 0);
	}

}