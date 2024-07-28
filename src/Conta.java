public class Conta {
    private Titular titular; //composição de obijeto
    private double saldo;
    private int numeroDaConta;
    private int agencia;
    private static int totalDeContas;

    public Conta(int numeroDaConta, int agencia){
        Conta.totalDeContas++;
        System.out.println("total de contas criadas " + totalDeContas);
        this.numeroDaConta = numeroDaConta;
        this.agencia = agencia;
    }

    public void depositar(double valor){
        if (this.saldo >= valor) {
            this.saldo += valor;
        }else{
            System.out.println("voce não pusui saldo suficiente para depositar");
        }
    }

    public boolean sacar(double valor){
        if (this.saldo >= valor) {
            this.saldo -= valor;
            return true;
        }
        return false;
    }

    public boolean transferir(double valor, Conta destino){
        if (this.saldo >= valor) {
            this.saldo -= valor; //tirar o valor da minha conta de origrm 
            destino.depositar(valor);//pega a referencia e deposita o valor
            return true;
        }
        return false;
    }

    public double getSaldo() {
        return saldo;
    }

    public int getNumeroDaConta() {
        return numeroDaConta;
    }

    public int getAgencia() {
        return agencia;
    }

    public void setTitular(Titular titular){
        this.titular = titular;
    }

    public Titular geTitular(){
        return this.titular;
    }
    
}
