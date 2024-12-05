package entities;

import java.util.List;

public class Doctor {
    private int doctorId;
    private String name;
    private String specialization;
    private String email;
    private String phone;
    private List<Patient> patients;
    private List<Appointment> appointments;


    public Doctor(int doctorId, String name, String specialization, String email, String phone) {
        this.doctorId = doctorId;
        this.name = name;
        this.specialization = specialization;
        this.email = email;
        this.phone = phone;
    }

    public boolean checkdoctorAvailability(int doctorId, Appointment appointment) {
        long startTime = Long.parseLong(appointment.getStartTime());
        long endTime = Long.parseLong(appointment.getEndTime());
        if (appointments != null) {
            for (Appointment a : appointments) {
                long start = Long.parseLong(a.getStartTime());
                long end = Long.parseLong(a.getEndTime());
                if (start < endTime && end > startTime) {
                    return false;
                }
            }
        } else {
            return true;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Doctor{" +
                "doctorId=" + doctorId +
                ", name='" + name + '\'' +
                ", specialization='" + specialization + '\'' +
                ", email='" + email + '\'' +
                ", phone='" + phone + '\'' +
                '}';
    }

    public int getDoctorId() {
        return doctorId;
    }

    public void setDoctorId(int doctorId) {
        this.doctorId = doctorId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSpecialization() {
        return specialization;
    }

    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public List<Patient> getPatients() {
        return patients;
    }

    public void setPatients(List<Patient> patients) {
        this.patients = patients;
    }

    public List<Appointment> getAppointments() {
        return appointments;
    }

    public void setAppointments(List<Appointment> appointments) {
        this.appointments = appointments;
    }
}
