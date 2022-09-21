package contabancaria;

public class Cliente1 {
     public static void main(String[] args) {
         ContaBancaria Jose;
         Jose = new ContaBancaria();
         Jose.cliente = "Jose da Silva";
         Jose.saldo = (5784);
         Jose.limite = (7000);
         Jose.senha=(23456);
         Jose.numero=(5678);
         Jose.depositar(500);
       
     }
}