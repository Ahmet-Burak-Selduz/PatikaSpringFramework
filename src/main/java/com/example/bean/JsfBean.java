package com.example.bean;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Named;
import lombok.Getter;
import lombok.Setter;

@Named(value = "cdiBean")
@ApplicationScoped
@Setter
@Getter
public class JsfBean {
    private String patika;

    public JsfBean(){
        this.patika = "Springboot Eğitimine Hoş Geldiniz !";
    }


}
