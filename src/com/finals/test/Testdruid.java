package com.finals.test;

import com.finals.utils.Dbutils;

import java.sql.Connection;
import java.sql.SQLException;

public class Testdruid {
    public static void main(String[] args) {
        Dbutils dbutils=new Dbutils();
        for(int i=1;i<=20;i++){
            Connection connection=dbutils.getconnection();
            System.out.println(connection);
            try {
                connection.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}

