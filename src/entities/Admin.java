package entities;

import java.util.List;

public class Admin {
    private String username;
    private List<Doctor> doctors;
    private List<Patient> patients;
    private List<Department> departments;

    public Admin(String username, List<Doctor> doctors, List<Patient> patients, List<Department> departments) {
        this.username = username;
        this.doctors = doctors;
        this.patients = patients;
        this.departments = departments;
    }

    @Override
    public String toString() {
        return "Admin{" +
                "username='" + username + '\'' +
                ", doctors=" + doctors +
                ", patients=" + patients +
                ", departments=" + departments +
                '}';
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public List<Doctor> getDoctors() {
        return doctors;
    }

    public void setDoctors(List<Doctor> doctors) {
        this.doctors = doctors;
    }

    public List<Patient> getPatients() {
        return patients;
    }

    public void setPatients(List<Patient> patients) {
        this.patients = patients;
    }

    public List<Department> getDepartments() {
        return departments;
    }

    public void setDepartments(List<Department> departments) {
        this.departments = departments;
    }
}
