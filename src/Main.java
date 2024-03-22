// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        itProducts its = new itProducts("logitech",123);
        Mouse mou = new Mouse("logitech", 1000, "a");
        Mouse mou2 = new Mouse();
        mou2.setMarca("raze");
        mou2.setName("a2");
        mou2.setPrice(1234);
        System.out.println(mou2.getName() +" " + mou2.getMarca() + " " + mou2.getPrice());
    }
}