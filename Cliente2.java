package contabancaria;

public class Cliente2 {
     public static void main(String[] args) {
         ContaBancaria Maria;
         Maria = new ContaBancaria();
         Maria.cliente= "Maria da Conceição";
         Maria.saldo = (2000);
         Maria.limite= (4000);
         Maria.senha=(201406);
         Maria.numero=(5689);
         Maria.depositar(780);
         Maria.Quant_parcelas=(5);
         Maria.emprestar(1000);
         
     }
}