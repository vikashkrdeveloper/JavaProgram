package Oops.src;
class Square{
    int calculateArea(int a){
        return 4*a;
    }
}
public class calculate_the_area_of_perimeter {
    public static void main(String[] args) {
        Square Calculate=new Square();
       int Area= Calculate.calculateArea(100);
        System.out.println(Area);
    }
}
