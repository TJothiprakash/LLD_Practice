package entities;

import java.util.List;

public class PatientHistory {
    private Patient patient;
    private List<Appointment> appointments;
    private String diagnosis;
    private String doctorName;
    private String departmentName;
    private int roomNumber;

    public PatientHistory(Patient patient, List<Appointment> appointments, String diagnosis, String doctorName, String departmentName, int roomNumber) {
        this.patient = patient;
        this.appointments = appointments;
        this.diagnosis = diagnosis;
        this.doctorName = doctorName;
        this.departmentName = departmentName;
        this.roomNumber = roomNumber;
    }

    @Override
    public String toString() {
        return "PatientHistory{" +
                "patient=" + patient +
                ", appointments=" + appointments +
                ", diagnosis='" + diagnosis + '\'' +
                ", doctorName='" + doctorName + '\'' +
                ", departmentName='" + departmentName + '\'' +
                ", roomNumber=" + roomNumber +
                '}';
    }

    public Patient getPatient() {
        return patient;
    }

    public void setPatient(Patient patient) {
        this.patient = patient;
    }

    public List<Appointment> getAppointments() {
        return appointments;
    }

    public void setAppointments(List<Appointment> appointments) {
        this.appointments = appointments;
    }

    public String getDiagnosis() {
        return diagnosis;
    }

    public void setDiagnosis(String diagnosis) {
        this.diagnosis = diagnosis;
    }

    public String getDoctorName() {
        return doctorName;
    }

    public void setDoctorName(String doctorName) {
        this.doctorName = doctorName;
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }

    public int getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(int roomNumber) {
        this.roomNumber = roomNumber;
    }
}
