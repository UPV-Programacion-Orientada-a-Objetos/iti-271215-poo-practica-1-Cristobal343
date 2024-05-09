package edu.upVictoria.POO.Services;

import junit.framework.TestCase;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class SQLMannagerTest extends TestCase {

    public SQLMannager sqlMannagerTest = new SQLMannager();

    public void testCONSOLE() {
        try {
            sqlMannagerTest.CONSOLE();
        }catch (IOException e){
            e.printStackTrace();
        }
    }

    public void testCREATE_DATABASE() {
        assertEquals(true,sqlMannagerTest.CREATE_DATABASE("Cristov"));
        assertEquals(true,sqlMannagerTest.CREATE_DATABASE("Cristov"));
    }

    public void testDROP() {
        assertEquals(true,sqlMannagerTest.DROP("Pablov"));
        //assertEquals(false,sqlMannagerTest.DROP("cristov"));
    }

    public void testSELECT() {
    }

    public void testINSERT() {
    }
}