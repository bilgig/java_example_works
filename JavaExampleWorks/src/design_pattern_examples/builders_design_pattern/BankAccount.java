package design_pattern_examples.builders_design_pattern;

public class BankAccount {
    private long accountNumber;
    private String owner;
    private double balance;
    private double interestRate;

    public BankAccount(BankAccountBuilder bankAccountBuilder) {
        this.accountNumber = bankAccountBuilder.accountNumber;
        this.owner = bankAccountBuilder.owner;
        this.balance = bankAccountBuilder.balance;
        this.interestRate = bankAccountBuilder.interestRate;
    }

    public long getAccountNumber() {
        return accountNumber;
    }

    public String getOwner() {
        return owner;
    }

    public double getBalance() {
        return balance;
    }

    public double getInterestRate() {
        return interestRate;
    }

    public static class BankAccountBuilder{
        private long accountNumber;
        private String owner;
        private double balance;
        private double interestRate;

        public BankAccountBuilder(long accountNumber) {
            this.accountNumber = accountNumber;
        }


        public BankAccountBuilder setOwner(String owner) {
            this.owner = owner;
            return this;
        }

        public BankAccountBuilder setBalance(double balance) {
            this.balance = balance;
            return this;
        }

        public BankAccountBuilder setInterestRate(double interestRate) {
            this.interestRate = interestRate;
            return this;
        }
        public BankAccount build(){
            return new BankAccount(this);
        }
    }
}
