class Surface{
    private int radius;
    private int height;
    void setRadius(int Radius){
        radius=Radius;
    }
    int getRadius(){
        return radius;
    }
    double getSurfaceAreaOfCylinder(){
        return 2* 3.14*radius*height+2*3.14*radius*radius;
    }
    void setHeight(int Height){
        height=Height;

    }
    int getHeight(){
        return height;
    }

}
public class SurfaceAreaOfCylinder{
    public static void main(String[] args) {
        Surface Cy=new Surface();
        Cy.setHeight(3);
        Cy.setRadius(5);
        System.out.println("Surface Area 0f cylinder is : "+Cy.getSurfaceAreaOfCylinder());

    }
}

