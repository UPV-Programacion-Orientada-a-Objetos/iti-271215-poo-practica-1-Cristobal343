package edu.upvictoria.poo;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Console {
    public Console() {

        BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));
        String in;

        System.out.println("CSqlV database");

        while (true){

            try {

                System.out.print(">");
                in = buf.readLine();

                if (in.equals("end;") || in.equals("end")){
                    break;
                }

            } catch (IOException e){
                e.printStackTrace();
            }

        }

    }
}
