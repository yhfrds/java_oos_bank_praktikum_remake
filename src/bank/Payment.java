package bank;

public class Payment {
    private String date;
    private double amount;
    private String description;
    private double incomingInterest;
    private double outgoingInterest;

    public Payment(String date, double amount, String description) {
        this.date = date;
        this.amount = amount;
        this.description = description;
    }

    public Payment(String date, double amount, String description, double incomingInterest, double outgoingInterest) {
        this(date, amount, description);  // It calls the three-parameter constructor using the 'this' keyword to avoid redundant code and sets the values of incomingInterest and outgoingInterest.
        this.incomingInterest = incomingInterest;
        this.outgoingInterest = outgoingInterest;
    }

    public Payment(Payment payment) {
        this(payment.getDate(), payment.getAmount(), payment.getDescription(), payment.getIncomingInterest(), payment.getOutgoingInterest());
    }

    public void printObject() {
        System.out.println("Date: " + this.getDate());
        System.out.println("Amount: " + this.getAmount());
        System.out.println("Description: " + this.getDescription());
        System.out.println("Incoming Interest: " + this.getIncomingInterest());
        System.out.println("Outgoing Interest: " + this.getOutgoingInterest());
        System.out.println();
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getIncomingInterest() {
        return incomingInterest;
    }

    public void setIncomingInterest(double incomingInterest) {
        this.incomingInterest = incomingInterest;
    }

    public double getOutgoingInterest() {
        return outgoingInterest;
    }

    public void setOutgoingInterest(double outgoingInterest) {
        this.outgoingInterest = outgoingInterest;
    }
}
