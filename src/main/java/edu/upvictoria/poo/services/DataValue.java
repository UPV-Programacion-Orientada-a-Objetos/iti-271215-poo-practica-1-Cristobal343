package edu.upvictoria.poo.services;

import javax.xml.crypto.Data;

public class DataValue {

    public DataType Type;
    public int longuitud;

    public DataValue(DataType type, int longuitud){
        this.Type = type;
    }

    public enum DataType {

        INTERGER("interger"),
        FLOAT("float"),
        CHAR("char"),
        VARCHAR2("varchar2");

        private String datatype;

        DataType(String datatype) {

            this.datatype = datatype;

        }

        public String getDatatype() {
            return this.datatype;
        }

    }
}
