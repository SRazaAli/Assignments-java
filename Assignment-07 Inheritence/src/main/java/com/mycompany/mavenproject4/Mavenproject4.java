
package com.mycompany.mavenproject4;

class Account{
    private int accountNo;
    private Member accountOwner;
    private String accountBranch;
    private double accountBalance;
    //methods
    public String getOwnerEmail(){
        return accountOwner.getMemberEmail();
    }
     public String getOwnerContact(){
        return accountOwner.getMemberContact();
    }
     //getters
    public int getAccountNo() {
        return accountNo;
    }

    public String getAccountBranch() {
        return accountBranch;
    }

    public double getAccountBalance() {
        return accountBalance;
    }
    //constructors
    public Account(int accountNo, Member accountOwner, String accountBranch, double accountBalance) {
        this.accountNo = accountNo;
        this.accountOwner = accountOwner;
        this.accountBranch = accountBranch;
        this.accountBalance = accountBalance;
    }

    public Account() {
    }

    @Override
    public String toString() {
        return "Account{" + "accountNo=" + accountNo +
                ", accountOwnerName =" + accountOwner.getMemberName() + ", accountBranch=" +"AccountOwner Email : "+accountOwner.getMemberEmail()+
                "Account Branch : "+accountBranch + ", accountBalance=" + accountBalance + '}';
    }
    
}
class Member{
private String memberName,memberEmail,memberContact;
    //getters
    public String getMemberName() {
        return memberName;
    }

    public String getMemberEmail() {
        return memberEmail;
    }

    public String getMemberContact() {
        return memberContact;
    }
//constructors
    public Member(String memberName, String memberEmail, String memberContact) {
        this.memberName = memberName;
        this.memberEmail = memberEmail;
        this.memberContact = memberContact;
    }

    public Member() {
    }

    

}
class CurrentAccount extends Account{
    private String accountType;

    public String getAccountType() {
        return accountType;
    }

    public CurrentAccount(String accountType) {
        this.accountType = accountType;
    }

    public CurrentAccount() {
    }

    public CurrentAccount(String accountType, int accountNo, Member accountOwner, String accountBranch, double accountBalance) {
        super(accountNo, accountOwner, accountBranch, accountBalance);
        this.accountType = accountType;
    }

    @Override
    public String toString() {
        return super.toString()+"currentAccount{" + "accountType=" + accountType + '}';
    }

    
    
}
class SavingAccount extends Account{
    private String accountType;

    public SavingAccount() {
    }

    public SavingAccount(String accountType, int accountNo, Member accountOwner, String accountBranch, double accountBalance) {
        super(accountNo, accountOwner, accountBranch, accountBalance);
        this.accountType = accountType;
    }

    public SavingAccount(String accountType) {
        this.accountType = accountType;
    }

    public String getAccountType() {
        return accountType;
    }

    @Override
    public String toString() {
        return super.toString()+"savingAccount{" + "accountType=" + accountType + '}';
    }
    
}
public class Mavenproject4 {

    public static void main(String[] args) {
        //Creting 3 members
        Member member1 = new Member("Raza","asyedraza85632@gmail.com","03121218932");
        Member member2 = new Member("Muskan","muskan123@gmail.com","03242423176");
        Member member3 = new Member("Aimen","aimen134@gmail.com","031516183873");
        //assigning 2 members to currentAccount
        CurrentAccount acc1 = new CurrentAccount("Bachat",001,member1,"Malir",12000.00);
        CurrentAccount acc2 = new CurrentAccount("Bachat",002,member2,"Malir",15000.500);
        //assigning 1 member to savingsAccount
        SavingAccount acc3 = new SavingAccount("Mega Bachat",003,member3,"Malir",42000.500);
        System.out.println(acc1);
        System.out.println(acc2);
        System.out.println(acc3);
    }
}
