public class Calculate {
    public static void main(String[] args) {
       int a = 10;
       int b = 2;

       Calc calc = new Calc();

        System.out.println("Wynik dodawania: " + a + " + " +  b + " = " +  calc.add(a,b));
        System.out.println("Wynik odejmowania: " + a + " + " +  b + " = " +  calc.subtract(a,b));
        System.out.println("Wynik mnożenia: " + a + " + " +  b + " = " +  calc.multiply(a,b));
        System.out.println("Wynik dzielenia: " + a + " + " +  b + " = " +  calc.divide(a,b));

    }
}
