public class Main {
    public static void main(String[] args) {
        Titular t1 = new Titular();
        t1.nome = "sandro";
        t1.cpf = "222.222.222-54";
        t1.

        Conta c1 = new Conta();
        c1.saldo = 300;
        //c1.sacar(20);
        //c1.depositar(10);

        Conta c2 = new Conta();
        c2.saldo = 300; 

        if(c2.transferir(900, c1)){
            System.out.println("transferencia feita com sucesso");//true
        }else{
            System.out.println("seu saldo é insuficiente");
        }

        System.out.println(c2.saldo);//400
        System.out.println(c1.saldo);//200

     

    }
}
