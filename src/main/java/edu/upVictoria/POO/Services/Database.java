package edu.upVictoria.POO.Services;

import edu.upVictoria.POO.Services.Interfaces.ISQLcreate_drop;
import edu.upVictoria.POO.Services.Interfaces.SQLconsult;

import java.io.File;
import java.io.IOException;
import java.nio.file.NoSuchFileException;
import java.util.ArrayList;
import java.util.List;

public class Database extends SQLMannager implements ISQLcreate_drop {

    private String name;

    private List<Table> tables;

    public Database(String name){
        this.name = name;
        this.tables = new ArrayList<>();
    }

    public String getName(){
        return this.name;
    }

    public void CREATE_TABLE(){
        try {
            File file = new File(String.format("%s%s"));
            System.out.println(String.format("Table %s create!"));
        }catch (RuntimeException e){
            throw new RuntimeException("Something wrong happend");
        }
    }

    public boolean DROP_TABLE(String name) {


    }

}
