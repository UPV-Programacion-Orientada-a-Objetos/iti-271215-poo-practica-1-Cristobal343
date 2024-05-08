package edu.upVictoria.POO.Services;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;

public class SQLMannager implements SQLsentences{

    public static Object object;
    private static BufferedReader input;



    public static void CONSOLE() throws IOException{

        input = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("MY CSQL");

        while (!input.readLine().toLowerCase().equals("exit")) {



        }

    }

    public void CREATE_DATABASE(String name) {

        File database = new File(String.format("Desktop/Database/%s",name));
        boolean isMake = database.mkdir();

        if (isMake == true){
            System.out.println("Database create sussesfull!");
        }
        else {
            System.out.println("Database can't bee create :c");
        }

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


}
