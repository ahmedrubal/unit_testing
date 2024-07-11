package com.syntexpro;

public class Customer {
    public int setSize(int s){
        System.out.println("Name is Assigned :"+s);
        return s;

    }
    public String setName(String name){
        return name;
      // System.out.println("Name is Assigned"+name);

        }

        public String greetings(String great){
        return great;
       // System.out.println("Hi, How are you"+great);
        }
        public String  setSwitch(){
      String value = "value1";
        switch (value){
            case "value1": return "s";

            case "value2": return "m";

            case "value3": return "l";

            default: return "s";
        }

        }

}

