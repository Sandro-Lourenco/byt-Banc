public class Conta {
    private String titular;
    double saldo;
    private int numeroDaConta;
    private int agencia;
    private int nume; 

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

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public int getNumeroDaConta() {
        return numeroDaConta;
    }

    public void setNumeroDaConta(int numeroDaConta) {
        this.numeroDaConta = numeroDaConta;
    }

    public int getAgencia() {
        return agencia;
    }

    public void setAgencia(int agencia) {
        this.agencia = agencia;
    }

    public int getNume() {
        return nume;
    }

    public void setNume(int nume) {
        this.nume = nume;
    }

    
}
