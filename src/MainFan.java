public class MainFan {
    public static void main(String[] args) {
        Fan fan1= new Fan();
//        fan1.setSpeed(fan1.FAST);
//        int speed= fan1.getSpeed();
//        fan1.setRadius(10);
//        double radius= fan1.getRadius();
//        fan1.setColor("Yellow");
//        String color= fan1.getColor();
//        fan1.setOn(true);
//        boolean on= fan1.getOn();
//        System.out.println(fan1.toString());;
        fan1.setSpeed(fan1.FAST);
        fan1.setRadius(10);
        fan1.setColor("Yellow");
        fan1.setOn(true);
        System.out.println(fan1.toString());

        Fan fan2= new Fan();
        fan2.setSpeed(fan2.SLOW);
        fan2.setRadius(5);
        fan2.setColor("blue");
        fan2.setOn(false);
        System.out.println(fan2.toString());
    }
}
