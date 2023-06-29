class Rectanguler {
    int volume;
    int SurfaceArea;
}

class Square extends Rectanguler {
    public void setVolume(int Volume) {
        volume = Volume;
    }

    public void setSurfaceArea(int Surfacearea) {
        SurfaceArea = Surfacearea;
    }

}

class Circle extends Square {
    public int getVolume() {
        return volume;
    }

    public int getSurfaceArea() {
        return SurfaceArea;
    }

}

class Cylinder extends Circle {

}

class Sphere extends Cylinder {

}

class inheritances {

    public static void main(String[] args) {
        Circle cr = new Circle();
        Square sq=new Square();
        sq.setSurfaceArea(2);
        sq.setVolume(3);
        System.out.println(cr.getSurfaceArea());
        System.out.println(cr.getVolume());
    }
}
