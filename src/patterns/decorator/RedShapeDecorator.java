package patterns.decorator;

public class RedShapeDecorator extends ShapeDecorator {
    public RedShapeDecorator(Shape shape) {
        super(shape);
    }

    // draw函数配颜色函数
    @Override
    public void draw() {
        super.draw();
        setRedColor(decoratorShape);
    }

    private void setRedColor(Shape shape) {
        System.out.println("set red color");
    }
}
