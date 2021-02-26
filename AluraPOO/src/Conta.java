public class Conta {
    double saldo;
    int agencia;
    int numero;
    String titular;

    public void /**Quando não existe qualquer tipo de retorno ao acionarmos um método, utilizamos a palavra-chave void*/
    deposita(double valor){
        this.saldo += valor;
    }
    public boolean saca(double valor) {
        if (this.saldo >= valor) {
            this.saldo -= valor;
            return true;
        } else {
            return false;
        }
    }
}
