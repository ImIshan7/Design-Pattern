package lk.ijse.design_pattern.Structural.Decorator_Design;

public abstract class ShapeDecorator implements Shape{
    protected Shape decoratorShape;

    //constructor
    public ShapeDecorator(Shape decoratorShape){
        //initiate shape object
        this.decoratorShape=decoratorShape;
    }
    //override method
    public void draw(){
        decoratorShape.draw();
    }
}
