public class DecimalNumber {
    public static void main(String[] args) {
        double numero;
        NumeroInteiro(2.345);
        NumeroDecimal(2.345);
    }
    static void NumeroInteiro(double numero){
        System.out.println("Parte inteira: " + (int)numero);
    }
    static void NumeroDecimal(double numero){
        double x = numero;
        int inteiro = (int) x;
        double sub = numero - inteiro;
        System.out.println("Parte decimal: " + sub);
    }
    
}
