package kr;

public class Circle implements Shape {
    int radius;
    Colour colour;

    Circle(int radius, Colour colour){
        this.colour=colour;
        this.radius=radius;

        }

    @Override
    public double size() {
        return Math.PI*radius*radius;
    }

    @Override
    public Colour colour() {

        return colour;
    }
}

