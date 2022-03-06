package ro.unibuc.inheritance.multilevel;

import java.util.Arrays;

public class TransferStudent extends Student {

    private String transferredUniversity;
    private Integer transferredCredit;

    public void displayTransferStudentDetails() {
        System.out.println("Transferred Student details: ");
        System.out.println("Transferred university: " + transferredUniversity);
        System.out.println("Transferred credit: " + transferredCredit);
    }

    public String getTransferredUniversity() {
        return transferredUniversity;
    }

    public void setTransferredUniversity(String transferredUniversity) {
        this.transferredUniversity = transferredUniversity;
    }

    public Integer getTransferredCredit() {
        return transferredCredit;
    }

    public void setTransferredCredit(Integer transferredCredit) {
        this.transferredCredit = transferredCredit;
    }
}
