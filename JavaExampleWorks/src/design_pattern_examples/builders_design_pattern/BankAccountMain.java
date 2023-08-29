package design_pattern_examples.builders_design_pattern;

public class BankAccountMain {
  public static void main(String[] args) {
    BankAccount bankAccount1=new BankAccount.BankAccountBuilder(123L).build();
    BankAccount bankAccount2=new BankAccount.BankAccountBuilder(456L)
            .setOwner("Bart")
            .setBalance(100.00)
            .build();

    BankAccount getBankAccount3=new BankAccount.BankAccountBuilder(789L)
            .setOwner("Marge")
            .setBalance(100.00)
            .setInterestRate(2.5)
            .build();
    System.out.println();
  }


}
