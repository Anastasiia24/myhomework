package kr;


import java.util.ArrayList;
import java.util.List;



public class Main {
    public static void main(String[] args) {
        Shape f1 = new Circle(13, Colour.BLUE);
        Shape f2 = new Circle(3, Colour.RED);
        Shape f3 = new Circle(23, Colour.GREEN);
        Shape f4 = new Circle(33, Colour.RED);
        Shape f5 = new Square(5, Colour.BLUE);
        Shape f6 = new Square(10, Colour.RED);
        Shape f7 = new Square(15, Colour.GREEN);
        Shape f8 = new Square(20, Colour.BLUE);
        Shape f9 = new Square(25, Colour.GREEN);


        List<Shape> figure = new ArrayList<>();
        figure.add(f1);
        figure.add(f2);
        figure.add(f3);
        figure.add(f4);
        figure.add(f5);
        figure.add(f6);
        figure.add(f7);
        figure.add(f8);
        figure.add(f9);

        System.out.println("RED figure cost:");
        calculateCost(figure, Colour.RED);
        System.out.println("The most expensive figure costs:" + findMostExpensive(figure, Colour.RED));
        System.out.println("");

        System.out.println("BLUE figure cost:");
        calculateCost(figure, Colour.BLUE);
        System.out.println("The most expensive figure costs:" + findMostExpensive(figure, Colour.BLUE));
        System.out.println("");

        System.out.println("GREEN figure cost:");
        calculateCost(figure, Colour.GREEN);
        System.out.println("The most expensive figure costs:" + findMostExpensive(figure, Colour.GREEN));

    }


    private static void calculateCost(List<Shape> shapes, Colour filterColour) {
        double all;

        for (Shape shape : shapes) {
            if (shape.colour() == filterColour) {
                System.out.println(shape.size() * shape.colour().val());
            }
        }

    }

    private static double findMostExpensive(List<Shape> shapes, Colour filterColour) {
        double ME1 = shapes.get(0).size() * shapes.get(0).colour().val();
        for (Shape shape : shapes) {
            if (shape.colour() == filterColour) {
                double ME2 = shape.size() * shape.colour().val();
                if (ME2 > ME1) {
                    ME1 = ME2;
                }
            }
        }
        return ME1;
    }

}