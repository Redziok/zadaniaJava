package pl.imiajd.mingielewiczbetterrectangle;

import java.awt.*;
import java.io.IOException;

public class main {
    public static void main(String[] args) throws IOException {
        Point p = new Point(0, 0);
        Dimension d = new Dimension(4, 2);
        pl.imiajd.mingielewiczbetterrectangle.BetterRectangle betterRectangle = new pl.imiajd.mingielewiczbetterrectangle.BetterRectangle(p, d);
        System.out.println("Dla prostokąta o wymiara x na y " + betterRectangle.getWidth() + " " + betterRectangle.getHeight());
        System.out.println("Powierzchnia prostokata: " + betterRectangle.getArea());
        System.out.println("Obwód prostokąta: " + betterRectangle.getPerimeter());
    }
}