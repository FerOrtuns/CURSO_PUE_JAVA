package curso.poo.bank_account;

public class Main {

    public static void main(String[] args) {

        BankAccount cuentaFran = new BankAccount("a", 30000);
        System.out.println(cuentaFran);
        BankAccount cuentaStephan = new BankAccount("b", 200000);

        cuentaFran.withdraw(100);
        System.out.println(cuentaFran);

    }

}
