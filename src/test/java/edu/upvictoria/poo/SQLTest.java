package edu.upvictoria.poo;

import org.junit.jupiter.api.Test;

import java.io.FileNotFoundException;

import static org.junit.jupiter.api.Assertions.*;

class SQLTest {

    @Test
    public void queryTest(){

        String route = "DELEATE DATABASE /home/cristov/DataBase/HolaTonotos;";

        try {
            new SQL().setQuery(route);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }

    }
}