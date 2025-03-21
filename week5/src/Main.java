public class Main {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
    }
}
public class Main {
    public static void main(String[] args) {
        point p1 = new point();
        System.out.println(p1.xcoord);
        System.out.println(p1.ycoord);


        point p2 = new point(x:3,y:4);
        System.out.println(p2.xcoord);
        System.out.println(p2.ycoord);


        point p3 = new point(x:5);
        System.out.println(p3.xcoord);
        System.out.println(p3.xcoord);
        rectangle r1 =new rectangle (
                P3,
                SideA:4,
                SideB:5
        );
        System.out.println(r1.getSideB());
        System.out.println(r1.getSideB());
        System.out.println(r1.getTopleft());
        System.out.println(r1.getTopleft().xcoord);
        System.out.println(r1.getTopleft().ycoord);
        System.out.println(r1.periem);
        System.out.println(r1.area());
    }
}