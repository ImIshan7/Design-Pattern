package lk.ijse.design_pattern.Creational.Factory_Design;

public class ShapeFactory {

    public Shape getShape(String shapeType){
        if(shapeType == null){
            return null;
        }
            if(shapeType.equalsIgnoreCase("Circule")){
                return new Circule();
            }else if(shapeType.equalsIgnoreCase("SQUARE")){
                return new Square();
            }else  if (shapeType.equalsIgnoreCase("RECTANGLE")){
                return new Rectangle();
            }


        return null;
    }

}
