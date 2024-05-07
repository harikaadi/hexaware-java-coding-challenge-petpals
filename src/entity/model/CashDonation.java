package entity.model;
import dao.Donation;
import java.time.LocalDateTime;

public class CashDonation extends Donation {
    // Additional attribute
    private LocalDateTime donationDate;

    // Constructor
    public CashDonation(String donorName, double amount, LocalDateTime donationDate) {
        super(donorName, amount);
        this.donationDate = donationDate;
    }

    // Method to record a cash donation
    @Override
    public void recordDonation() {
        // Implement record keeping logic here
        System.out.println("Cash donation recorded for donor: " + getDonorName() +
                ", Amount: $" + getAmount() + ", Date: " + donationDate);
    }

    
}
