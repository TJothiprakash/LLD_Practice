package entities;

import java.text.SimpleDateFormat;

public class Billing {
    private int billId;
    private int patientId;
    private int doctorId;
    private int departmentId;
    private long billDate;
    private String billTime;
    private String billType;
    private String billDescription;
    private int amount;
    private String paymentMethod;

    public Billing(int billId, int patientId, int doctorId, int departmentId) {
        this.billId = billId;
        this.patientId = patientId;
        this.doctorId = doctorId;
        this.departmentId = departmentId;
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        this.billDate = Long.parseLong(dateFormat.format(System.currentTimeMillis()));
        this.billTime = System.currentTimeMillis() + "";
        this.amount = 100;
        this.paymentMethod = "Cash";
    }

    public Billing(int billId, int patientId, int doctorId, int departmentId, long billDate, String billTime, String billType, String billDescription, int amount, String paymentMethod) {
        this.billId = billId;
        this.patientId = patientId;
        this.doctorId = doctorId;
        this.departmentId = departmentId;
        this.billDate = billDate;
        this.billTime = billTime;
        this.billType = billType;
        this.billDescription = billDescription;
        this.amount = amount;
        this.paymentMethod = paymentMethod;
    }

    @Override
    public String toString() {
        return "Billing{" +
                "billId=" + billId +
                ", patientId=" + patientId +
                ", doctorId=" + doctorId +
                ", departmentId=" + departmentId +
                ", billDate=" + billDate +
                ", billTime='" + billTime + '\'' +
                ", billType='" + billType + '\'' +
                ", billDescription='" + billDescription + '\'' +
                ", amount=" + amount +
                ", paymentMethod='" + paymentMethod + '\'' +
                '}';
    }

    public int getBillId() {
        return billId;
    }

    public void setBillId(int billId) {
        this.billId = billId;
    }

    public int getPatientId() {
        return patientId;
    }

    public void setPatientId(int patientId) {
        this.patientId = patientId;
    }

    public int getDoctorId() {
        return doctorId;
    }

    public void setDoctorId(int doctorId) {
        this.doctorId = doctorId;
    }

    public int getDepartmentId() {
        return departmentId;
    }

    public void setDepartmentId(int departmentId) {
        this.departmentId = departmentId;
    }

    public long getBillDate() {
        return billDate;
    }

    public void setBillDate(long billDate) {
        this.billDate = billDate;
    }

    public String getBillTime() {
        return billTime;
    }

    public void setBillTime(String billTime) {
        this.billTime = billTime;
    }

    public String getBillType() {
        return billType;
    }

    public void setBillType(String billType) {
        this.billType = billType;
    }

    public String getBillDescription() {
        return billDescription;
    }

    public void setBillDescription(String billDescription) {
        this.billDescription = billDescription;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public String getPaymentMethod() {
        return paymentMethod;
    }

    public void setPaymentMethod(String paymentMethod) {
        this.paymentMethod = paymentMethod;
    }
}
