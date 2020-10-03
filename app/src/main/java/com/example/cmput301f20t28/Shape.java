package com.example.cmput301f20t28;

public abstract class Shape {
    private int X;
    private int y;
   

    public Shape(int x, int y) {
        this.X = x;
        this.y = y;
    }

    public int getX() {
        return X;
    }

    public int getY() {
        return y;
    }

    public void setX(int x) {
        X = x;
    }

    public void setY(int y) {
        this.y = y;
    }
}
