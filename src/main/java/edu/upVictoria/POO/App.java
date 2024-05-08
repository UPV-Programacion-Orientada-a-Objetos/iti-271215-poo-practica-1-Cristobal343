package edu.upVictoria.POO;

import edu.upVictoria.POO.Services.SQLMannager;
import edu.upVictoria.POO.Services.Table;

import java.io.IOException;

public class App
{
    public static void main( String[] args )
    {
        try {
            SQLMannager.CONSOLE();
        }catch (IOException e){
            e.printStackTrace();
        }
    }

}
