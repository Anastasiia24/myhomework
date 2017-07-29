package kr;

public class Square implements Shape {
    int length;
    Colour colour;

    Square(int length, Colour colour){
        this.length=length;
        this.colour=colour;
    }


    @Override
    public double size() {
      return  length*length;
    }

    @Override
    public Colour colour() {
      return colour;
    }
}
