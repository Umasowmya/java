public class Circle {
    int radius;
    Circle(int radius){
        this.radius=radius;
    }

    public int get_radius(){
        return radius;
    }

    public void set_radius(int radius){
        this.radius=radius;
    }

    public double get_area(){
        return (3.14*radius);
    }

    public double get_perimeter(){
        return (2*3.14*radius);
    }

}
