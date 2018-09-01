package com.ender.xchange.repositories;

import com.ender.xchange.model.Client;
import org.springframework.data.repository.CrudRepository;

public interface ClientRepository extends CrudRepository<Client,Long> {
}
