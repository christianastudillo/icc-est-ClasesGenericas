public class App {
    public static void main(String[] args) throws Exception {

        Producto<Integer> producto1 = new Producto<>(1, "Café", 3.5);
        Producto<String> producto2 = new Producto<>("A123", "Té", 2.0);

        System.out.println(producto1);
        System.out.println(producto2);
    }
}