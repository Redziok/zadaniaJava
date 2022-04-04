package pl.imiajd.mingielewiczbetterrectangle;

import java.awt.*;

public class BetterRectangle extends Rectangle {
    public BetterRectangle(Point p, Dimension d) {
        setLocation(p);
        setSize(d);
    }
    public double getPerimeter() {
        return super.height*2 + super.width*2;
    }
    public double getArea() {
        return super.height * super.width;
    }
}
