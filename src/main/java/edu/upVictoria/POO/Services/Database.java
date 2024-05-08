package edu.upVictoria.POO.Services;

import java.util.List;

public class Database implements SQLsentences,SQLconsult{

    private String name;

    private List<Table> tables;

    public void CREATE_TABLE(){

    }

    @Override
    public void DROP(String name) {

    }

    @Override
    public void SELECT(String name) {

    }

    @Override
    public void INSERT(String name) {

    }

    @Override
    public void FORM() {

    }

    @Override
    public void WHERE() {

    }

    @Override
    public String SHOW() {
        return null;
    }

}
