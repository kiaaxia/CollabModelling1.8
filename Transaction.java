public class Transaction {
	
	public int transactionID;
	public double amount;
	
	public Transaction (int transactionID, double amount) {
		this.transactionID = transactionID;
		this.amount = amount;
	}
	public void processTransaction() {
		
	}
	public String identifyRole () {
		return "I am the transaction, I handle money movement.\n";
	}
}