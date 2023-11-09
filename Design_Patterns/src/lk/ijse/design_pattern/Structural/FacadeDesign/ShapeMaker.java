package lk.ijse.design_pattern.Structural.FacadeDesign;

import javafx.scene.shape.Circle;

public class ShapeMaker {
    private Shape square;
    private Shape rectangle;


    public ShapeMaker(){
        square=new Square();
        rectangle=new Rectangle();
    }

    public void drawSquare(){
        square.draw();
    }
    public void drawRectangle(){
        rectangle.draw();
    }
}
