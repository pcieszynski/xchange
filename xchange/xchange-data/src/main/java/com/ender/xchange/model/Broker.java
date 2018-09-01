package com.ender.xchange.model;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "brokers")
public class Broker {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column
    private String name;

    @Column
    private String surname;

    @OneToMany
    @JoinColumn
    private List<Client> clients;

    public Broker() {
    }

    public Broker(List<Client> clients) {
        this.clients = clients;
    }

    public List<Client> getClients() {
        return clients;
    }

    public void setClients(List<Client> clients) {
        this.clients = clients;
    }
}
