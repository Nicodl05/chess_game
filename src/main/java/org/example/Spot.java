package org.example;

public class Spot {
    private Piece piece;
    private boolean occupied;
    private int x;
    private int y;
    private char letter;
    private int number;

    public Spot(int x, int y, char letter, int number, Piece piece) {
        this.setPiece(piece);
        this.setX(x);
        this.setY(y);
        this.setLetter(letter);
        this.setNumber(number);
        if (piece == null) {
            occupied = false;
        } else {
            occupied = true;
        }
    }

    public Piece getPiece() {
        return this.piece;
    }

    public void setPiece(Piece p) {
        this.piece = p;
        if (piece == null) {
            occupied = false;
        } else {
            occupied = true;
        }
    }

    public int getX() {
        return this.x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return this.y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public char getLetter() {
        return letter;
    }

    public void setLetter(char letter) {
        this.letter = letter;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public boolean isOccupied() {
        return occupied;
    }
}