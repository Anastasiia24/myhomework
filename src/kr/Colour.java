package kr;

public enum Colour {
    RED(12),
    GREEN(15),
    BLUE(14);


    int col;

    Colour() {

    }

    Colour(int col) {
        this.col=col;
    }

    public int val() {
        return (Colour.this.col);
    }

    @Override
    public String toString() {
        return (Colour.this.name());
    }

}
