package edu.upvictoria.poo;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class SQL {

    private String pathroute;
    private String defaultfolder;

    /***
     * setQuery permite que puedas ingresar las estrutura sql y esta pueda ejecutar una
     * sentecia sql.
     * @param query
     * @throws SQLExeptions
     * @throws FileNotFoundException
     */

    public void setQuery(String query) throws SQLExeptions, FileNotFoundException {

        if (query.endsWith(";")) {

            String[] split = query.split("[ ,;]+");
            List<String> iter = Arrays.asList(split);
            Iterator<String> it = iter.iterator();

            new SQLSyntaxTree(it);

        } else {
            throw new SQLExeptions("query must end with ;");
        }

    }

    private final class SQLSyntaxTree {

        private SQLSyntaxTree(Iterator<String> iterQuery) throws SQLExeptions, FileNotFoundException{

            String clause = iterQuery.next();

            if (clause.equals("CREATE")){

                new CREATE(iterQuery);

            }
            else if (clause.equals("USE")){

                new USE(iterQuery);

            }
            else if (clause.equals("SELECT")){

            }
            else if (clause.equals("DROP")){

                new DROP(iterQuery);

            }
            else if (clause.equals("INSERT INTO")){

            }
            else throw new SQLExeptions(String.format("%s not recognize",clause));

        }

        final class CREATE {

            private CREATE(Iterator<String> iterQuery) throws SQLExeptions{

                if (iterQuery.hasNext()) {

                    String caluse = iterQuery.next();

                    if (caluse.equals("DATABASE")) {

                        new CREATEDatabase(iterQuery);

                    } else if (caluse.equals("TABLE")) {

                    } else {

                        throw new SQLExeptions(String.format("%s not recognize", caluse));
                    }

                } else throw new SQLExeptions(String.format("Do you need specify CREATE clause"));

            }

            /**
             * Create leaf
             */

            final class CREATETable {

                final class SquareBarkets {

                    private SquareBarkets (Iterator<String> iterQuery) throws SQLExeptions{

                        if (iterQuery.hasNext()) {

                            String openbraket = iterQuery.next();

                            if (openbraket.equals("(")){


                            }else throw new SQLExeptions("Do you need open ( for write arguments");

                        } else throw new SQLExeptions("Do you need write minimum one argument for create the table ");

                    }

                    final class ARGUMENTS {

                        private ARGUMENTS(String [] arguments) {

                            for (String arg : arguments){



                            }

                        }

                    }

                }


            }

            /**
             * CREATE DATABASE leaf
             */

            static final class CREATEDatabase {


                private CREATEDatabase(Iterator<String> iterQuery) throws SQLExeptions{

                    if (iterQuery.hasNext()){

                        String routepath = iterQuery.next();

                        File directory = new File(String.format("%s",routepath));

                        if (directory.exists()){
                            System.err.println("Database already exists");
                        }
                        else try {
                            directory.mkdir();
                        }catch (SecurityException e){
                            throw new RuntimeException("Database cannot be created");
                        }

                    }
                    else throw new SQLExeptions("Specify the route path");
                }

            }

        }

        final class USE {

            private USE (Iterator<String> iterQuery) throws SQLExeptions, FileNotFoundException {

                String clause = iterQuery.next();

                if (clause.equals("USE")) {

                    new USEDatabase(iterQuery);

                } else if (!iterQuery.hasNext()) {

                    throw new SQLExeptions("has expected route path");
                }
            }

            final class USEDatabase{

                private USEDatabase(Iterator<String> iterQuery) throws SQLExeptions, FileNotFoundException{
                    String route = iterQuery.next();

                    File directory = new File(route);

                    if (directory.exists()){

                        pathroute = route;

                    }else throw new FileNotFoundException("Route does not exist");

                }

            }

        }

        /**
         * Drop class
         */

        private class DROP {

            private DROP (Iterator<String> iterQuery) throws SQLExeptions, FileNotFoundException {

                String clause = iterQuery.next();

                if (clause.equals("database")){

                    new DropDatabase(iterQuery);

                } else if (clause.equals("table")) {

                }else throw new SQLExeptions("DROP clause expect table or database");

            }

            class DropDatabase {

                private DropDatabase(Iterator<String> iterQuery) throws SQLExeptions, FileNotFoundException {

                    if (iterQuery.hasNext()){

                        String route = iterQuery.next();

                        File file = new File(route);

                        if (file.exists() && file.isDirectory()){

                            file.delete();

                            System.out.println("database is dropped");

                        } else throw new FileNotFoundException(String.format("%s dosen't found in directory",route));

                    }else throw new FileNotFoundException("specify the route path");

                }

            }

            class DropTable {
            }
        }

        class INSERT {
            class InsertInto {
            }
        }

        class SELECT {
            class SelectStatement {
            }

            class FromClause {
            }

            class WhereClause {
            }
        }

    }

}