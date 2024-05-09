package edu.upVictoria.POO.Services;

import edu.upVictoria.POO.Services.Interfaces.ISQLcreate_drop;
import edu.upVictoria.POO.Services.Interfaces.SQLconsult;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Table extends SQLMannager implements ISQLcreate_drop {

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
    public boolean DROP(String name) {
        try{
            Files.deleteIfExists(Paths.get("/Desktop/"));
        }catch (IOException e){

        }
        return true;
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
