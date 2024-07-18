package edu.upvictoria.poo;

public class SQLExeptions extends RuntimeException{

    public SQLExeptions(String message){
        throw new RuntimeException(message);
    }
}
