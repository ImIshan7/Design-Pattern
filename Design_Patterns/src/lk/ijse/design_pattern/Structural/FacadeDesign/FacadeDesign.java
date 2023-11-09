package lk.ijse.design_pattern.Structural.FacadeDesign;

public class FacadeDesign {
    public static void main(String[] args) {
        ShapeMaker shapeMaker=new ShapeMaker();
        shapeMaker.drawSquare();
        shapeMaker.drawRectangle();
    }
}
