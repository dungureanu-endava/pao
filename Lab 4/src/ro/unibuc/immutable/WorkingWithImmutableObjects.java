package ro.unibuc.immutable;

import java.util.Date;

/**
 * To make a class immutable it must:
 * - not be extended (to override the getters/setters)
 * - setters should not exist or throw exceptions if they do
 * - getters should return clones of mutable fields
 * - constructors should store clones of mutable parameters
 */
final class CreditCard {

    private final Long number;
    private final String owner;
    private final Date expiryDate;
    private final Brand brand;
    private final Chip chip;

    public CreditCard(Long number, String owner, Date expiryDate, Brand brand, Chip chip) {
        this.number = number;
        this.owner = owner;
        this.expiryDate = expiryDate;
        this.brand = brand;
        this.chip = new Chip(chip);
    }

    @Override
    public String toString() {
        return "CreditCard Number: " + number + "; Owner: " + owner + "; Expiry Date=" + expiryDate +
                "; Brand: " + brand + "; " + chip;
    }

    public Long getNumber() {
        return number;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        throw new UnsupportedOperationException("Setting is not allowed!");
    }

    public Date getExpiryDate() {
        return expiryDate;
    }

    public Brand getBrand() {
        return brand;
    }

    public Chip getChip() {
        return chip.deepCopy();
    }

    public void setChip(Chip chip) {
        throw new UnsupportedOperationException("Setting is not allowed!");
    }
}

enum Brand {
    VISA,
    MASTERCARD
}

class Chip {

    private int chipId;
    private String chipType;

    public Chip(Chip chip) {
        this.chipId = chip.chipId;
        this.chipType = chip.chipType;
    }

    public Chip(int chipId, String chipType) {
        this.chipId = chipId;
        this.chipType = chipType;
    }

    public Chip deepCopy() {
        return new Chip(this);
    }

    @Override
    public String toString() {
        return "Chip Id: " + chipId + "; Chip Type: " + chipType;
    }

    public int getChipId() {
        return chipId;
    }

    public void setChipId(int chipId) {
        this.chipId = chipId;
    }

    public String getChipType() {
        return chipType;
    }

    public void setChipType(String chipType) {
        this.chipType = chipType;
    }
}

public class WorkingWithImmutableObjects {

    public static void main(String[] args) {
        Chip masterChip = new Chip(311, "Mastercard Chip");

        CreditCard creditCard = new CreditCard(3412_5392L, "John Doe", new Date(), Brand.MASTERCARD, masterChip);

        System.out.println(creditCard);
    }

}
