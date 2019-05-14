package com.codecool.termlib;

public enum Color {
    BLACK("30"),
    RED("31"),
    GREEN("32"),
    YELLOW("33"),
    BLUE("34"),
    MAGENTA("35"),
    CYAN("36"),
    WHITE("37");

private String colorCode; 
  
    // getter method 
    public String getColor() 
    { 
        return this.colorCode; 
    } 
  
    // enum constructor - cannot be public or protected 
    private Color(String colorCode) 
    { 
        this.colorCode = colorCode; 
    } 
}


