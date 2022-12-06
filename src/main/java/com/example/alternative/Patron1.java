package com.example.alternative;

import jakarta.enterprise.context.Dependent;
import jakarta.enterprise.inject.Alternative;

@Alternative
@Dependent
public class Patron1 implements IPatron{
    @Override
    public String getSurum(String data) {
        return "Patron 1 " + data;
    }
}
