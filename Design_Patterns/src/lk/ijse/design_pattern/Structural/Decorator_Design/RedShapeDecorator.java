package lk.ijse.design_pattern.Structural.Decorator_Design;

public class RedShapeDecorator extends ShapeDecorator{

    public RedShapeDecorator(Shape decoratorShape) {
        //calling most supper class constructor
        super(decoratorShape);
    }
    @Override
    public void draw(){
        decoratorShape.draw();
        setRedBorder(decoratorShape);
    }

    private void setRedBorder(Shape decoratorShape) {
        System.out.println("Border Colour : Red");
    }
}
