public class KarsilastirmaOperatorleri {
    public static void main(String[] args) {
        System.out.println("--------- Karşılaştırma Operatörleri -----------------");

        // Karşılaştırma Operatörleri
        int x = 15;
        int y = 20;
        int z = y - x + 10; // z will be 15

        System.out.println(x < y);   // true
        System.out.println(x == y);  // false
        System.out.println(z == y);   // true
        System.out.println(y > x);    // true
        System.out.println(!(x < y)); // false
    }
}
