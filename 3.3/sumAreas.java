import java.util.ArrayList;
import java.util.List;

public class sumAreas {

    private List<Shape> shapeList;

    public sumAreas() {
        shapeList = new ArrayList<Shape>();
    }

    public void addShape(Shape shape){
        shapeList.add(shape);
    }

    public void removeShape(Shape shape){
        shapeList.remove(shape);
    }

    public float computeSumAreas(){
        float sum = 0;

        for(Shape i : shapeList){
            sum=sum+i.getArea();
        }
        return sum;
    }


}
