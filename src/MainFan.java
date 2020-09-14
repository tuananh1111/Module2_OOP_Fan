public class MainFan {
    public static void main(String[] args) {
        Fan fan1= new Fan();
        fan1.setSpeed(fan1.FAST);
        int speed= fan1.getSpeed();
        fan1.setRadius(10);
        double radius= fan1.getRadius();
        fan1.setColor("Yellow");
        String color= fan1.getColor();
        fan1.setOn(true);
        boolean on= fan1.getOn();

    }
}
