public class Main {
    public static void main(String[] args) {
        Conta c2 = new Conta();
        c2.saldo = 300; 

        Conta c1 = new Conta();
        c1.saldo = 300;
        //c1.sacar(20);
        //c1.depositar(10);
        c1.transferir(100, c2);


        System.out.println(c2.saldo);//400
        System.out.println(c1.saldo);//200

     

    }
}
