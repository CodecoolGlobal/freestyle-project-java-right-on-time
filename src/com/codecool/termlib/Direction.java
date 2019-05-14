package com.codecool.termlib;

public enum Direction {
    UP("A"),
    DOWN("B"),
    FORWARD("C"),
    BACKWARD("D");

    private String directionCode; 
  
    // getter method 
    public String getDirection() 
    { 
        return this.directionCode; 
    } 
  
    // enum constructor - cannot be public or protected 
    private Direction(String directionCode) 
    { 
        this.directionCode = directionCode; 
    } 
}

