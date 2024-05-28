package facade.HR;

public class AccountingSystem {
    public void updateLedger(PayrollSystem payroll) {
        System.out.println("Ledger->updated");
    }

    public double availableFunds() {
        return 777.77;
    }
}
