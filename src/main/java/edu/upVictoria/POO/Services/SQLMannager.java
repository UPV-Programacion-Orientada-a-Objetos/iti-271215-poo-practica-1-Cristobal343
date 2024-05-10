package edu.upVictoria.POO.Services;

import java.io.*;
import java.nio.file.DirectoryNotEmptyException;
import java.nio.file.Files;
import java.nio.file.NoSuchFileException;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class SQLMannager {

    static String $Path;

    public static List<Database> databases = new ArrayList<>();

    private static BufferedReader input;

    private  static String consoleInput = "";

    public SQLMannager (String Path){

        $Path = Path;

        /**
         * Load database if this exist
         */


    }

    /**
     * El metodo CONOSOLE permite que interactues con los comando de CSQLV
     * mediante terminal o consola, esta puede tener exepciones de ejecicion
     * asi que prestale mucho ojo
     * @throws IOException
     */
    public static void CONSOLE() throws IOException{

        input = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("CSQLV Mannagment");

        while (!consoleInput.toLowerCase().equals("exit")) {

            System.out.print("CSQLV> ");

            consoleInput = input.readLine();

            if (Valiadar_Semantica(consoleInput)){

            }
            else {
                System.out.println("Syntaxis Error");
            }

        }

    }

    /**
     * Este metodo valida las sintaxis de SQL que ingreses en
     * consola
     * @param consoleInput
     * @return
     */
    private static boolean Valiadar_Semantica(String consoleInput){

        String [] query = consoleInput.split(" ");
        int i = 0;

        while (i < query.length){

            if (query[i].toLowerCase().equals("create")){

                if (query[i + 1].toLowerCase().equals("database")){

                }
                else if (query[i + 1].toLowerCase().equals("table")){

                }

            }
           else if (query[i].toLowerCase().equals("use")){

           }
           else if (query[i].toLowerCase().equals("select")){

           }
           else if (query[i].toLowerCase().equals("insert")){

           }
           else if (query[i].toLowerCase().equals("drop")){

           }

        }

        return true;
    }

    public boolean CREATE_DATABASE(String name) {

        File database = new File(String.format("%s%s",$Path,name));
        boolean isMake = database.mkdir();

        if (isMake == true){
            System.out.println("Database create sussesfull!");
        }
        else {
            System.out.println("Database can't bee create :c");
        }

        databases.add(new Database("name"));

        return isMake;

    }

    /**
     * El metodo USE_DATABASE es utilizado por la case SQLMannager para
     * selecionar una carpeta dentro de la ruta $PATH que sera usada para
     * almacenar de archivo csv, el metodo es el omonimo del propio
     * comando USE TABLE dentro de sql y permite hacer virtula mente lo mismo.
     * @param name
     * @return
     */
    public Database USE_DATABASE(String name){

        boolean dbisfound = false;
        Database database = null;
        int i = 0;

        while(!dbisfound && i < databases.size()){
            if (name.equals(databases.get(i).getName())){
                dbisfound = true;
                database = databases.get(i);
            }
        }

        if (!dbisfound){
            System.out.println("La base de datos ho ha sido encontrada :c");
        }

        return database;

    }

    public void SHOW_DATABASE(){

    }

    /**
     * El metodo DROP es un metodo publico estatico que cumple la funcion de
     * eliminar directorios dentro de el $PATH de nuestra base de datos cumple
     * el rolo de DROP DATABASE para eliminar bases de datos y todos los archivo
     * que este contengan.
     * @param name
     * @return
     */
    public boolean DROP_TABLE(String name) {

        boolean delDir = false;

        try{

            Files.deleteIfExists(Paths.get(String.format("%s/%s",$Path,name)));
            delDir = true;

            System.out.println("Deleate sussesfull!");

        }
        catch (NoSuchFileException e) {
            throw new RuntimeException("File not found");
        }
        catch (DirectoryNotEmptyException e){
            throw new RuntimeException("Directory is empty");
        }
        catch (IOException e){
            throw new RuntimeException("Permiso invalidos");
        }

        return delDir;
    }


    private void CREATE(){

    }

}
