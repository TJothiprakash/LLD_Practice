//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {



    /*Design a system for a hospital where:

Patients can register and schedule appointments.
Doctors can manage their schedules and view patient records.
Admins can manage hospital facilities (rooms, departments, etc.).
The system tracks billing and patient history.

        entities
        --entities.Patient
        --Doctor : has a list of patients, has a schedule of appointments
        --Admin : has a list of doctors, has a list of rooms and their availability
        --Appointment : has a patient, has a doctor, has a date and time
        --Room : has a list of appointments
        --Department : has a list of rooms
        --Billing : has a patient, has a doctor, has a date and time, has an amount
        --PatientHistory : has a patient, has a doctor, has a date and time, has a diagnosis, list of diagnoses


    design :

*/
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.printf("Hello and welcome!");

        for (int i = 1; i <= 5; i++) {
            //TIP Press <shortcut actionId="Debug"/> to start debugging your code. We have set one <icon src="AllIcons.Debugger.Db_set_breakpoint"/> breakpoint
            // for you, but you can always add more by pressing <shortcut actionId="ToggleLineBreakpoint"/>.
            System.out.println("i = " + i);
        }
    }
}