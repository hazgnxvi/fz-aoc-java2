package modules.shapes;

import modules.Geometry;

public class Triangle implements Geometry {
    private Float a, t;

    public Float getA() {
        return a;
    }

    // set and get
    public void setA(Float a) {
        this.a = a;
    }

    public Float getT() {
        return t;
    }

    public void setT(Float t) {
        this.t = t;
    }

    // constructor
    public Triangle() {
    }

    public Triangle(Float a, Float t) throws Exception {
        this.setA(a);
        this.setT(t);
    }

    @Override
    public void gambarGeometry() {
        System.out.println("Gambar : ");
        String result = "";

        for (int i = 1; i <= a; i++) {
            for (int j = 4; j >= i; j--) {
                result += " ";
            }
            for (int k = 1; k <= i; k++) {
                result += "*";
            }
            for (int l = 1; l <= i - 1; l++) {
                result += "*";
            }
            result += "\n";
        }
        System.out.print(result);
    }

    @Override
    public Float luasGeometri() {
        return (a * t) / 2;
    }

    @Override
    public Float kelilingGeometry() {
        return a * 3;
    }

}
