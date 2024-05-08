package edu.upVictoria.POO.Services;

import java.io.File;
import java.io.IOException;
import com.beginsecure.domain.csvreader.CsvReader;

public class Table implements SQLsentences, SQLconsult{

    public String name;

    public String conetent;

    public Table(String name){

        this.name = name;

        try {
            File file = new File(String.format("Desktop/Database/%s.csv", name));
        }catch (RuntimeException e){
            throw new RuntimeException("Table can't create");
        }

        this.conetent = "";

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
    public String SHOW(){

        return null;
    }
}
