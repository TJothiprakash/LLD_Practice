import entities.Appointment;
import entities.Doctor;
import entities.Patient;
import entities.PatientHistory;

public class PatientHandler {
    // register patient and schedule appointment
    // we use setter injection to inject the required classes
    private Patient patient;
    private PatientHistory patientHistory;
    private Doctor doctor;
    private Appointment appointment;


    public void setPatientHandlerDependencies(Patient patient, PatientHistory patientHistory, Doctor doctor, Appointment appointment) {
        this.patient = patient;
        this.patientHistory = patientHistory;
        this.doctor = doctor;
        this.appointment = appointment;

    }


    //new patient registration
    public boolean registerPatient(Patient patient) {
        // do the stuff like saving the patient to the database
        //now this fn is just a placeholder
        System.out.println("Patient with id " + patient.getPatientId() + " has been registered.");
        return true;
    }

    public boolean scheduleAppointment(Patient patient, PatientHistory patientHistory, Doctor doctor, Appointment appointment) {
        //now this fn is just a placeholder
        // here we need do two things,
        // 1. check for doctor availability for the appointment date and time
        boolean isDoctorAvailable = doctor.checkdoctorAvailability(doctor.getDoctorId(), appointment);
        //2. schedule the appointment
        if (isDoctorAvailable) {
            System.out.println("Patient with id " + patient.getPatientId() + " has been scheduled for an appointment.");
            return true;
        } else {
            System.out.println("Patient with id " + patient.getPatientId() + " could not be scheduled for an appointment.");
            return false;
        }
    }

}
