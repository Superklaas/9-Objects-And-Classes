package be.vdab.Ex98Fan;

public class TestFan {
    public static void main(String[] args) {

        // Create fan1 and set values
        Fan fan1 = new Fan();
        fan1.setSpeed(Fan.FAST);
        fan1.setRadius(10);
        fan1.setColor("yellow");
        fan1.setOn(true);

        // Create fan2 and set values
        Fan fan2 = new Fan();
        fan2.setSpeed(Fan.MEDIUM);
        fan2.setRadius(5);
        fan2.setColor("blue");
        fan2.setOn(false);

        // Display values fan1
        System.out.println("FAN 1");
        System.out.println(fan1.toString());

        // Display values fan2
        System.out.println("FAN 2");
        System.out.println(fan2.toString());

    }
}
