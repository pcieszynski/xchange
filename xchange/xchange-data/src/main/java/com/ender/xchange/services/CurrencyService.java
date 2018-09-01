package com.ender.xchange.services;

import com.ender.xchange.model.Currency;
import com.ender.xchange.model.CurrencyType;
import com.ender.xchange.repositories.CurrencyRepository;

public class CurrencyService {

    private final CurrencyRepository currencyRepository;

    private CurrencyService(CurrencyRepository currencyRepository) {
        this.currencyRepository = currencyRepository;
    }

    public Currency retreiveCurrency()
    {
        return new Currency(1L,CurrencyType.EUR,100.0);
    }

}
