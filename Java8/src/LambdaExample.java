interface Shape{
    void draw();
}

class Rectangle implements Shape{

    @Override
    public void draw() {
        System.out.println("Rectangle class : draw() method ");
    }
}

class Square implements Shape{

    @Override
    public void draw() {
        System.out.println("Square class : draw() method ");
    }
}

class Circle implements Shape{

    @Override
    public void draw() {
        System.out.println("Circle class : draw() method ");
    }
}


public class LambdaExample {

    public static void main(String[] args) {
        Shape rectangle = () -> System.out.println("Rectangle class : draw() method 1");
        rectangle.draw();

        Shape square = () -> System.out.println("square class : draw() method ");
        square.draw();
    }
}


