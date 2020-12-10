public class Desconto {
    public static void main(String[] args) {
        double valor;
        double desconto;
        calcula(120, 10);
        
    }
    static void calcula(double valor, double desconto){
        double ParaDecimal = desconto * 0.01;
        double ValorDesconto = valor * ParaDecimal;
        double ValorAtual = valor - ValorDesconto;
        System.out.println("O novo valor é de: " + ValorAtual);
    }
    
}
