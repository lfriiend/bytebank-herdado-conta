public class TesteContas {
    public static void main(String[] args) throws Exception {

        ContaCorrente cc = new ContaCorrente(111, 111);
        cc.deposita(100);

        ContaPoupanca cp = new ContaPoupanca(222, 222);
        cp.deposita(200);

        cc.transfere(10, cp);

        System.out.println("Saldo conta corrente " + cc.getSaldo());

        System.out.println("Saldo conta poupança " + cp.getSaldo());
    }
}
