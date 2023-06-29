class Cylinder{
 private int radius;
private int height;
void setRadius(int Radius){
    radius=Radius;
}
int getRadius(){
    return radius;
}
void setHeight(int Height){
    height=Height;

}
int getHeight(){
    return height;
}

}
public class question1solution {
    public static void main(String[] args) {
        Cylinder Cy=new Cylinder();
       Cy.setHeight(50);
        System.out.println(Cy.getHeight());
        Cy.setRadius(40);
        System.out.println(Cy.getRadius());

    }
}
