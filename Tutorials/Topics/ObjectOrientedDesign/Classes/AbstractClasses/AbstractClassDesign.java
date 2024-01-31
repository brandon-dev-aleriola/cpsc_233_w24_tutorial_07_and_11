package ObjectOrientedDesign.Classes.AbstractClasses;

public class AbstractClassDesign {
}

interface GrahphicReturn {
    int getX(int x);
    int getY(int y);
}

abstract class GraphicObject implements GrahphicReturn {
    // declare fields
    // declare nonabstract methods
    int x, y;
    abstract int draw();
    abstract int resize();
}

final class Circle extends GraphicObject {
    public Circle(int x, int y){
       super.x = x;
       super.y = y;;
    }
    int draw() {
        return x*y;
    }
    int resize() {
        return x*x*y;
    }
    public int getX(int x){
        return x;
    }
    public int getY(int y){
        return y;
    }

    public final void myToString(){
        System.out.println("Final Method");
    }
}

class Superclass {
    public void printMethod() {
        System.out.println("Printed in Superclass.");
    }
}

class Subclass extends Superclass {
    // overrides printMethod in Superclass
    public void printMethod() {
        super.printMethod();
        System.out.println("Printed in Subclass");
    }
    public static void main(String[] args) {
        Subclass s = new Subclass();
        s.printMethod();
    }
}

//Printed in Superclass.
//Printed in Subclass