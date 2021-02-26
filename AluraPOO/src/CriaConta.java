public class CriaConta {
    public static void main(String[] args) {
        Conta /*Atribui sempre com a outra classe*/ primeiraConta =new Conta ();
        //new para instanciar outra classe, no caso foi o Conta
        primeiraConta.saldo = 200;//O . faz o link com a outra classe
        System.out.println (primeiraConta.saldo);
        primeiraConta.saldo += 100;
        System.out.println (primeiraConta.saldo);
        Conta segundaConta = new Conta ();
         segundaConta.saldo = 50;
        System.out.println ("primeira conta "+primeiraConta.saldo);
        System.out.println ("segunda conta "+segundaConta.saldo);
        System.out.println (primeiraConta.agencia);
        System.out.println (primeiraConta.numero);
        System.out.println (primeiraConta.titular);
    }
}
