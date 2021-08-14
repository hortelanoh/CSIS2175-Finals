public class Savings {
    int custNum;
    String custName = "";
    float iniDeposit;
    int numYears;
    String saveType = "";

    public Savings(int custNum, String custName, float iniDeposit, int numYears, String saveType) {
        this.custNum = custNum;
        this.custName = custName;
        this.iniDeposit = (float) iniDeposit;
        this.numYears = numYears;
        this.saveType = saveType;
    }
}
