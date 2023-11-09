package lk.ijse.design_pattern.Structural.Facade_Design;

public class FacadeDesign {
    public static void main(String[] args) {
       /* ShapeMaker shapeMaker=new ShapeMaker();
        shapeMaker.drawSquare();
        shapeMaker.drawRectangle();*/

        Square square=new Square();
        square.draw();

        Rectangle rectangle=new Rectangle();
        rectangle.draw();


    }
}
