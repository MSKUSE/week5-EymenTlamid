public class circle {
}
public class circle {


    private point center ;
    private int radius;

    public point getCenter() {
        return center;
    }

    public void setCenter(point center) {
        this.center = center;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public circle(point center , int radius) {
        this .center =center;
        this.radius=radius;


    }
}