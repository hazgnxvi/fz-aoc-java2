package modules.shapes;

import modules.Geometry;

public class Square implements Geometry {

    private Float s;

    // set and get
    public Float getS() {
        return s;
    }

    public void setS(Float s) {
        this.s = s;
    }

    // constructor
    public Square() {
    }

    public Square(Float s) throws Exception {
        this.setS(s);
    }

    @Override
    public void gambarGeometry() {
        System.out.println("Gambar : ");
        String result = "";
        for (int i = 0; i < s; i++) {
            for (int j = 0; j < s; j++) {
                result += "*";
            }
            result += "\n";
        }
        System.out.print(result);
    }

    @Override
    public Float luasGeometri() {
        return this.s * this.s;
    }

    @Override
    public Float kelilingGeometry() {
        return 4 * this.s;
    }

}
