package za.ac.cput.domain;

public class Transaction {

            private int transactionId;
            private String transactionType;
            private double transactionAmount;
            private Date transactionDate;

            public Transaction(int transactionId, String transactionType, double transactionAmount, Date transactionDate) {
                this.transactionId = transactionId;
                this.transactionType = transactionType;
                this.transactionAmount = transactionAmount;
                this.transactionDate = transactionDate;
            }

            // Getters and setters for the properties

            public int getTransactionId() {
                return transactionId;
            }

            public void setTransactionId(int transactionId) {
                this.transactionId = transactionId;
            }

            public String getTransactionType() {
                return transactionType;
            }

            public void setTransactionType(String transactionType) {
                this.transactionType = transactionType;
            }

            public double getTransactionAmount() {
                return transactionAmount;
            }

            public void setTransactionAmount(double transactionAmount) {
                this.transactionAmount = transactionAmount;
            }

            public Date getTransactionDate() {
                return transactionDate;
            }

            public void setTransactionDate(Date transactionDate) {
                this.transactionDate = transactionDate;
            }

            // Other methods to perform business logic related to transactions

            public void executeTransaction() {
                // Perform the transaction logic here
            }

            public boolean validateTransaction() {
                // Perform the transaction validation logic here
                return true;
            }
    }
}
