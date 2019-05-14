package com.codecool.termlib;

public enum Attribute {
    RESET("0"),
    BRIGHT("1"),
    DIM("2"),
    UNDERSCORE("4"),
    BLINK("5"),
    REVERSE("7"),
    HIDDEN("8");
    
    private String attributeCode; 
  
    // getter method 
    public String getAttribute() 
    { 
        return this.attributeCode; 
    } 
  
    // enum constructor - cannot be public or protected 
    private Attribute(String attributeCode) 
    { 
        this.attributeCode = attributeCode; 
    } 
}
