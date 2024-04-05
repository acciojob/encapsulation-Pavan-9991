package com.driver;

public class Main {
    public static void main(String [] args){
        RWOnly obj = new RWOnly();

        obj.setName("Pavan Kumar");

        System.out.println(obj.getName());


    }

    public static class RWOnly{
        private String name;
        public String getName(){
            return name;
        }

        public void setName(String name){
            this.name = name;
        }
    }
  
}