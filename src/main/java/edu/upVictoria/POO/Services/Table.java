package edu.upVictoria.POO.Services;

import edu.upVictoria.POO.Services.Interfaces.SQLconsult;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class Table {

    public String name;

    public String [][] conetent;

    public Table(String name){

        this.name = name;

        try {
            File file = new File(String.format("%s/%s.csv", SQLMannager.$Path,name));
        }catch (RuntimeException e){
            throw new RuntimeException("Table can't create");
        }

        this.conetent = null;

    }

    public String getName(){
        return this.name;
    }

    public String ROW(String consult){

        boolean foundConsult = true;
        int i = 0;
        int j = 0;

        while (!foundConsult || i < conetent.length){

            while (!foundConsult || j < conetent[j].length){

                if

            }

        }

        return null;
    }

    public void SHOWTABLE(){

        System.out.println("+" + "-".repeat(20) + "+");

        for (String [] i: conetent){

            System.out.print("+");

            for (String j: i){

                System.out.print(String.format("%s %s",j," "));

            }

            System.out.println("+");
        }

        System.out.println("+" + "-".repeat(20) + "+");

    }
}
