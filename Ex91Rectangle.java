package be.vdab;

class Rectangle {
    double width;
    double height;

    Rectangle() {
        width = 1;
        height = 1;
    }

    Rectangle(double currentWidth, double currentHeight)  {
        width = currentWidth;
        height = currentHeight;
    }

    double getArea()    {
        return width * height;
    }

    double getPerimeter()   {
        return 2*width + 2*height;
    }
}

public class Ex91Rectangle {
    public static void main(String[] args) {

        Rectangle rectangle1 = new Rectangle(4, 40);
        System.out.println("\nRECTANGLE 1");
        System.out.println("Width: " + rectangle1.width);
        System.out.println("Height: " + rectangle1.height);
        System.out.println("Area: " + rectangle1.getArea());
        System.out.println("Perimeter: " + rectangle1.getPerimeter());

        Rectangle rectangle2 = new Rectangle(3.5, 35.9);
        System.out.println("\nRECTANGLE 2");
        System.out.println("Width: " + rectangle2.width);
        System.out.println("Height: " + rectangle2.height);
        System.out.println("Area: " + rectangle2.getArea());
        System.out.println("Perimeter: " + rectangle2.getPerimeter());

    }
}