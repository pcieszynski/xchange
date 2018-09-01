package com.ender.xchange.repositories;

import com.ender.xchange.model.Wallet;
import org.springframework.data.repository.CrudRepository;

public interface WalletRepository extends CrudRepository<Wallet,Long> {
}
