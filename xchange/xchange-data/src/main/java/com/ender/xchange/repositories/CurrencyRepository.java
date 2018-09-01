package com.ender.xchange.repositories;

import com.ender.xchange.model.Currency;
import org.springframework.data.repository.CrudRepository;

public interface CurrencyRepository extends CrudRepository<Currency,Long> {
}
