package be.vdab.Ex98Fan;

public class Fan {

    // constants
    final static int SLOW = 1;
    final static int MEDIUM = 2;
    final static int FAST = 3;

    // data fields
    private int speed = SLOW;
    private boolean on = false;
    private double radius = 5;
    private String color = "blue";

    // constructor
    public Fan()    {
    }

    // accessors and mutators
    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int currentSpeed)   {
        speed =  currentSpeed;
    }

    public boolean getOn() {
        return on;
    }

    public void setOn(boolean on) {
        this.on = on;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor()    {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    // string description of the fan
    public String toString()    {
        if (on == true)
            return "speed: " + Integer.toString(speed) + "\ncolor: " + color + "\nradius: " + Double.toString(radius);
        else
            return "color: " + color + "\nradius: " + Double.toString(radius) + "\nfan is off";
    }

}
