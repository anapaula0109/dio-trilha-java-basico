public class CaixaEletronico {
    public static void main(String[] args) {

    double saldo = 15000.0;
        double valorSolicitado = 1700.0;

        if(valorSolicitado < saldo){
            saldo = saldo - valorSolicitado;
            System.out.println("Novo saldo é: " + saldo);
        
        
        }else
            System.out.println("Saldo insuficiente");
                    
    }

}
