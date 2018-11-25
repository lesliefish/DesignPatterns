package patterns.decorator;

public abstract class ShapeDecorator implements Shape {
    protected Shape decoratorShape;

    public ShapeDecorator(Shape shape) {
        this.decoratorShape = shape;
    }

    @Override
    public void draw() {
        decoratorShape.draw();
    }
}
