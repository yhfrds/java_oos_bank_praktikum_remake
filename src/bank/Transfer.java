package bank;

public class Transfer {

    private String date;
    private double amount;
    private String description;
    private String sender;
    private String recipient;

    public Transfer(String date, double amount, String description) {
        this.date = date;
        this.amount = amount;
        this.description = description;
    }

    public Transfer(String date, double amount, String description, String sender, String recipient) {
        this(date, amount, description);
        this.sender = sender;
        this.recipient = recipient;
    }

    public Transfer(Transfer transfer) {
        this(transfer.getDate(), transfer.getAmount(), transfer.getDescription(), transfer.getSender(), transfer.getRecipient());
    }

    public void printObject() {
        System.out.println("Date: " + this.getDate());
        System.out.println("Amount: " + this.getAmount());
        System.out.println("Description: " + this.getDescription());
        System.out.println("Sender: " + this.getSender());
        System.out.println("Recipient: " + this.getRecipient());
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

    public String getSender() {
        return sender;
    }

    public void setSender(String sender) {
        this.sender = sender;
    }

    public String getRecipient() {
        return recipient;
    }

    public void setRecipient(String recipient) {
        this.recipient = recipient;
    }
}
