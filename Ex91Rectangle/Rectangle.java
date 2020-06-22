package be.vdab.Ex91Rectangle;

public class Rectangle {

        double width;
        double height;

        public Rectangle() {
            width = 1;
            height = 1;
        }

        public Rectangle(double currentWidth, double currentHeight)  {
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


