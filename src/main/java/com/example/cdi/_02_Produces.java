package com.example.cdi;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.enterprise.inject.Produces;
import jakarta.inject.Named;

import java.util.ArrayList;
import java.util.List;

@Named(value = "producetuto")
@ApplicationScoped
public class _02_Produces {
    @Produces
    public List<String> getList(){
        List<String> liste = new ArrayList<>();
        liste.add("HTML");
        liste.add("CSS");
        liste.add("JAVA SCRIPT");
        liste.add("REACT");
        return liste;
    }
}
