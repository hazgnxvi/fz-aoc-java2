import modules.MenuGeometry;

public class App {
    public static void main(String[] args) throws Exception {
        MenuGeometry menuGeometry = new MenuGeometry();

        System.out.print("""
                === Aplikasi Geometry ===
                List :
                1. Persegi
                2. Segitiga
                3. Persegi Panjang
                pilih : """);
        menuGeometry.getMenu();
    }
}
