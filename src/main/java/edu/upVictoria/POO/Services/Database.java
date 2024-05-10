package edu.upVictoria.POO.Services;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class Database {

    private String name;

    private List<Table> tables;

    public Database(String name){

        this.name = name;
        this.tables = new ArrayList<>();

    }

    public String getName(){
        return this.name;
    }

    public void CREATE_TABLE(String name){
        try {
            File file = new File(String.format("%s%s",SQLMannager.$Path,name));
            System.out.println(String.format("Table %s create!"));
        }catch (RuntimeException e){
            throw new RuntimeException("Something wrong happend");
        }

        tables.add(new Table(name));
    }

    /**
     * El metodo select realiza una consulta a una tabla donde
     * @param table
     * @param from
     * @param where
     * @return
     */
    public String SELECT_TABLE(Table table, String from, String where) {

        String result = null;

        if (where != null){

        }
        else {
            getTable(from);
        }

        return result;

    }

    public boolean DROP_TABLE(String name) {

        return true;
    }

    /**
     * El metodo getTable es privado y es utilizado para buscar los objetos dentro
     * de una lista tipo Table
     * @param name
     * @return
     */

    private Table getTable (String name){

        int i = 0;
        boolean foundTable = false;
        Table table = null;

        try {

            while (!foundTable || i < tables.size()) {

                if (tables.get(i).getName().equals(name)){
                    table = tables.get(i);
                }

            }

        } catch (IndexOutOfBoundsException e){
            throw new RuntimeException("Index out of bounds from Table.getTable");
        }

        if (table == null){
            System.err.println("Table doesn't exists!");
        }

    }

}
