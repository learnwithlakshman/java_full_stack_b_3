package com.lwl;

public class ConnectionUtil{


        public Connection getConnection(){
            String url = "jdbc:mysql://localhost:3306/batch_3";
            Connection connection = DriverManager.getConnection(url,"lakshman","lakshman");
            System.out.println("Connection :"+connection);
        }
}

