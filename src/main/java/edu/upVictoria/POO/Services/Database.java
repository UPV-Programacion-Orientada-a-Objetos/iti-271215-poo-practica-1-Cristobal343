package edu.upVictoria.POO.Services;

import edu.upVictoria.POO.Services.Interfaces.ISQLcreate_drop;
import edu.upVictoria.POO.Services.Interfaces.SQLconsult;

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



    }

    public boolean DROP_TABLE(String name) {


    }

}
