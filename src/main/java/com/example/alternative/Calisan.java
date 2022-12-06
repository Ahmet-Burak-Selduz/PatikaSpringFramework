package com.example.alternative;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import jakarta.inject.Named;

@Named(value = "alternativedi")
@ApplicationScoped
public class Calisan {
    @Inject
    private IPatron ipatron;

    public String getData(String data) {
        return ipatron.getSurum(data);
    }
}
