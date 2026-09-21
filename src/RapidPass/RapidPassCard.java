package RapidPass;

public class RapidPassCard {
    private String cardNumber;
    private double balance;
    private String category;
    private int status;
    private String issueDate;
    private String expiryDate;
    private Passenger passenger;
    private double monthlySpendTotal;

    public RapidPassCard(String cardNumber, double balance, String category,int status, String issueDate, String expiryDate, double monthlySpendTotal){
        this.cardNumber=cardNumber;
        this.balance=balance;
        this.category=category;
        this.status=status;
        this.issueDate=issueDate;
        this.expiryDate=expiryDate;
        this.monthlySpendTotal=monthlySpendTotal;
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public double getBalance() {
        return balance;
    }

    public String getCategory() {
        return category;
    }

    public int getStatus() {
        return status;
    }

    public String getIssueDate() {
        return issueDate;
    }

    public String getExpiryDate() {
        return expiryDate;
    }

    public Passenger getPassenger() {
        return passenger;
    }

    public double getMonthlySpendTotal() {
        return monthlySpendTotal;
    }
}
