package modules.shapes;

import modules.Geometry;

public class Rectangle implements Geometry {
    private float p, l;

    public float getP() {
        return p;
    }

    public void setP(float p) {
        this.p = p;
    }

    public float getL() {
        return l;
    }

    public void setL(float l) {
        this.l = l;
    }

    // constructor
    public Rectangle() {
    }

    public Rectangle(Float p, Float l) {
        this.setP(p);
        this.setL(l);
    }

    @Override
    public void gambarGeometry() {
        System.out.println("Gambar : ");
        String result = "";
        for (int i = 0; i < l; i++) {
            for (int j = 0; j < p; j++) {
                result += "*";
            }
            result += '\n';
        }
        System.out.print(result);
    }

    @Override
    public Float luasGeometri() {
        return p * l;
    }

    @Override
    public Float kelilingGeometry() {
        return 2 * (p + l);
    }

}
