package com.example.cmput301f20t28;

public abstract class Shape {
    private int x;
    private int y;

<<<<<<< HEAD
    private String color = "bluee";
=======
    String color = "test color blue";

>>>>>>> db5fdd85f169b96b60ecc29996fffbdb5fa5f389
   
    public Shape(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }
}
