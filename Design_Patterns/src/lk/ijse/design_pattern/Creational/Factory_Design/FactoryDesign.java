package lk.ijse.design_pattern.Creational.Factory_Design;

public class FactoryDesign {

    public static void main(String[] args) {
 ShapeFactory shapeFactory = new ShapeFactory();
 Shape shape1 = shapeFactory.getShape("Circule");
shape1.draw();
Shape shape2 = shapeFactory.getShape("RECTANGLE");
shape2.draw();
Shape shape3 = shapeFactory.getShape("SQUARE");
shape3.draw();


        }
}
