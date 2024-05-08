package edu.upVictoria.POO.Services;

import junit.framework.TestCase;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class SQLMannagerTest extends TestCase {

    public SQLMannager sqlMannagerTest = new SQLMannager();

    public void testCONSOLE() {

    }

    public void testCREATE_DATABASE() {
        try {
            sqlMannagerTest.CREATE_DATABASE("Estudiantes");
        }
        catch (RuntimeException e){
            throw new RuntimeException("database can't be create");
        }
    }

    public void testDROP() {
    }

    public void testSELECT() {
    }

    public void testINSERT() {
    }
}