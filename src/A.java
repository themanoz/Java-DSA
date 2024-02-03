import java.util.ArrayList;
import java.util.Scanner;
class sleep {
    public static void a() {
        System.out.print(A.RED+"\t Welcome to "+A.RESET);
        for (int i = 0; i < 5; i++) {
            try {
                System.out.print(" . ");
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println();
    }
    public static void d() {
        System.out.print(A.RED+"\t Adding Details "+A.RESET);
        for (int i = 0; i < 4; i++) {
            try {
                System.out.print(" . ");
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println();
    }
    public static void h() {
        System.out.print(A.RED+"\t Exiting "+A.RESET);
        for (int i = 0; i < 4; i++) {
            try {
                System.out.print(" . ");
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println();
    }
    public static void g() {
        System.out.print(A.RED+"\t Conforming Appointment "+A.RESET);
        for (int i = 0; i < 5; i++) {
            try {
                System.out.print(" . ");
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println();
    }
    public static void f() {
        System.out.print(A.RED+"\t Opening Details "+A.RESET);
        for (int i = 0; i < 3; i++) {
            try {
                System.out.print(" . ");
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println();
    }
    public static void b() {
        System.out.print("");
        for (int i = 0; i < 3; i++) {
            try {
                System.out.print("");
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println();
    }
    public static void c() {
        System.out.print(A.YELLOW+"Opening patient portal"+A.RESET);
        for (int i = 0; i < 2; i++) {
            try {
                System.out.print(" .");
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println();
    }
    public static void e() {
        System.out.print(A.YELLOW+"Opening doctor portal"+A.RESET);
        for (int i = 0; i < 2; i++) {
            try {
                System.out.print(" .");
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println();
    }
}
class Patient {
    private String name;
    private int age;
    private String phoneNumber;
    private String illness;

    public Patient(String name, int age, String phoneNumber, String illness) {
        this.name = name;
        this.age = age;
        this.phoneNumber = phoneNumber;
        this.illness = illness;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getIllness() {
        return illness;
    }
}

class Doctor {
    private String name;
    private String specialization;
    private String phoneNumber;

    public Doctor(String name, String specialization, String phoneNumber) {
        this.name = name;
        this.specialization = specialization;
        this.phoneNumber = phoneNumber;
    }

    public String getName() {
        return name;
    }

    public String getSpecialization() {
        return specialization;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }
}

class Appointment {
    private Patient patient;
    private Doctor doctor;
    private String date;

    public Appointment(Patient patient, Doctor doctor, String date) {
        this.patient = patient;
        this.doctor = doctor;
        this.date = date;
    }

    public Patient getPatient() {
        return patient;
    }

    public Doctor getDoctor() {
        return doctor;
    }

    public String getDate() {
        return date;
    }
}

class PatientManager {
    private ArrayList<Patient> patients;

    public PatientManager() {
        patients = new ArrayList<>();
    }

    public void addPatient(String name, int age, String phoneNumber, String illness) {
        patients.add(new Patient(name, age, phoneNumber, illness));
    }

    public ArrayList<Patient> getPatients() {
        return patients;
    }
}

class DoctorManager {
    private ArrayList<Doctor> doctors;

    public DoctorManager() {
        doctors = new ArrayList<>();
    }

    public void addDoctor(String name, String specialization, String phoneNumber) {
        doctors.add(new Doctor(name, specialization, phoneNumber));
    }

    public ArrayList<Doctor> getDoctors() {
        return doctors;
    }
}

class AppointmentManager {
    private ArrayList<Appointment> appointments;

    public AppointmentManager() {
        appointments = new ArrayList<>();
    }

    public void scheduleAppointment(Patient patient, Doctor doctor, String date) {
        appointments.add(new Appointment(patient, doctor, date));
    }

    public ArrayList<Appointment> getAppointments() {
        return appointments;
    }
}

class Hospital {
    private PatientManager patientManager;
    private DoctorManager doctorManager;
    private AppointmentManager appointmentManager;

    public Hospital() {
        patientManager = new PatientManager();
        doctorManager = new DoctorManager();
        appointmentManager = new AppointmentManager();
    }

    public PatientManager getPatientManager() {
        return patientManager;
    }

    public DoctorManager getDoctorManager() {
        return doctorManager;
    }

    public AppointmentManager getAppointmentManager() {
        return appointmentManager;
    }
}

class A {
    public static final String LIGHT_MAGENTA = "\u001B[95m";
    public static final String blink="\u001B[5m";
    public static final String GOLD = "\u001B[33m";
    public static final String RESET = "\033[0m";
    public static final String RED = "\033[0;31m";
    public static final String GREEN = "\033[0;32m";
    public static final String YELLOW = "\033[0;33m";
    public static final String BLUE = "\033[0;34m";
    public static final String PURPLE = "\033[0;35m";
    public static final String CYAN = "\033[0;36m";
    public static void main(String[] args) {
        Hospital hospital = new Hospital();
        Scanner scanner = new Scanner(System.in);
        int choice;
        System.out.println();
        sleep.a();
        System.out.println();
        System.out.println(blink+RED+"\t\t\t\t\t\t -----------------------------"+RESET);
        System.out.println(blink+BLUE+"\t\t\t\t\t\t| HOSPITAL MANAGEMENET SYSTEM |"+RESET);
        System.out.println(blink+RED+"\t\t\t\t\t\t -----------------------------"+RESET);
        System.out.println();
        System.out.println();

        do {
            sleep.b();
            System.out.println("\t\t\t\t\t 1. " + GREEN + "Add Patient" + RESET);
            System.out.println();
            System.out.println("\t\t\t\t\t 2. " + YELLOW + "Add Doctor" + RESET);
            System.out.println();
            System.out.println("\t\t\t\t\t 3. " + RED + "Schedule Appointment" + RESET);
            System.out.println();
            System.out.println("\t\t\t\t\t 4. " + PURPLE + "View Patients" + RESET);
            System.out.println();
            System.out.println("\t\t\t\t\t 5. " + BLUE + "View Doctors" + RESET);
            System.out.println();
            System.out.println("\t\t\t\t\t 6. " + CYAN + "View Appointments" + RESET);
            System.out.println();
            System.out.println("\t\t\t\t\t 7. " + RESET + "Exit");
            sleep.b();
            System.out.println();
            System.out.print(blink+"\t\t\t\t\tEnter your choice: "+RESET);
            choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    System.out.println();
                    sleep.c();
                    System.out.println();
                    System.out.print(GREEN+"\t\t\t\t\tEnter patient name: "+RESET);
                    String patientName = scanner.nextLine();
                    System.out.print(GREEN+"\t\t\t\t\tEnter patient age: "+RESET);
                    int patientAge = scanner.nextInt();
                    scanner.nextLine(); // Consume newline
                    System.out.print(GREEN+"\t\t\t\t\tEnter patient phone number: "+RESET);
                    String patientPhoneNumber = scanner.nextLine();
                    System.out.print(GREEN+"\t\t\t\t\tEnter patient illness: "+RESET);
                    String patientIllness = scanner.nextLine();
                    hospital.getPatientManager().addPatient(patientName, patientAge, patientPhoneNumber, patientIllness);
                    System.out.println();
                    sleep.d();
                    System.out.println(blink+LIGHT_MAGENTA+"\t\t\t\t\t\t Patient added successfully!"+RESET);
                    System.out.println();
                    break;
                case 2:
                    System.out.println();
                    sleep.e();
                    System.out.print(YELLOW+"\t\t\t\t\tEnter doctor name: "+RESET);
                    String doctorName = scanner.nextLine();
                    System.out.print(YELLOW+"\t\t\t\t\tEnter doctor specialization: "+RESET);
                    String doctorSpecialization = scanner.nextLine();
                    System.out.print(YELLOW+"\t\t\t\t\tEnter doctor phone number: "+RESET);
                    String doctorPhoneNumber = scanner.nextLine();
                    hospital.getDoctorManager().addDoctor(doctorName, doctorSpecialization, doctorPhoneNumber);
                    System.out.println();
                    sleep.d();
                    System.out.println(blink+LIGHT_MAGENTA+"\t\t\t\t\t\t Doctor added successfully!"+RESET);
                    System.out.println();
                    break;
                case 3:
                    System.out.println();
                    sleep.f();
                    ArrayList<Patient> patientsList = hospital.getPatientManager().getPatients();
                    ArrayList<Doctor> doctorsList = hospital.getDoctorManager().getDoctors();
                    if (patientsList.isEmpty() || doctorsList.isEmpty()) {
                        System.out.println();
                        System.out.println(GOLD+"\t\t\t\t\t\t\t Please add patients and doctors first."+RESET);
                        System.out.println();
                    } else {
                        System.out.println();
                        System.out.println(PURPLE+"\t\t\t\t\t\t Available Patients:"+RESET);
                        System.out.println();
                        for (int i = 0; i < patientsList.size(); i++) {
                            System.out.println("\t\t\t\t\t"+""+i + 1 + ". " + patientsList.get(i).getName());
                        }
                        System.out.println();
                        System.out.print(PURPLE+"\t\t\t\t\t Select patient (1-" + patientsList.size() + "): ");
                        int patientIndex = scanner.nextInt();
                        scanner.nextLine(); // Consume newline
                        System.out.println();
                        System.out.println(YELLOW+"\t\t\t\t\t\t Available Doctors:"+RESET);
                        System.out.println();
                        for (int i = 0; i < doctorsList.size(); i++) {
                            System.out.println("\t\t\t\t\t"+""+i + 1 + ". " + doctorsList.get(i).getName());
                        }
                        System.out.println();
                        System.out.print(GOLD+"\t\t\t\t\t Select doctor (1-" + doctorsList.size() + ")+RESET: "+RESET);
                        int doctorIndex = scanner.nextInt();
                        scanner.nextLine(); // Consume newline
                        System.out.println();
                        System.out.print("\t\t\t\t\t Enter appointment date: ");
                        String date = scanner.nextLine();
                        hospital.getAppointmentManager().scheduleAppointment(
                                patientsList.get(patientIndex - 1),
                                doctorsList.get(doctorIndex - 1),
                                date
                        );
                        System.out.println();
                        sleep.g();
                        System.out.println();
                        System.out.println(blink+PURPLE+"\t\t\t\t\t\t\t Appointment scheduled successfully!"+RESET);
                        System.out.println();
                    }
                    break;
                case 4:
                    System.out.println();
                    sleep.f();
                    System.out.println();
                    ArrayList<Patient> patientsData = hospital.getPatientManager().getPatients();
                    if (patientsData.isEmpty()) {
                        System.out.println();
                        System.out.println(blink+GOLD+"\t\t\t\t\t\t No patient data available."+RESET);
                        System.out.println();
                    } else {
                        System.out.println();
                        System.out.println(blink+PURPLE+"\t\t\t\t\t\t Patients Information:"+RESET);
                        System.out.println();
                        for (Patient patient : patientsData) {
                            System.out.println(GREEN+"\t\t\t\t\t Name: " +RESET+""+ patient.getName());
                            System.out.println(GREEN+"\t\t\t\t\t Age: " +RESET+""+ patient.getAge());
                            System.out.println(GREEN+"\t\t\t\t\t Phone Number: " +RESET+""+ patient.getPhoneNumber());
                            System.out.println(GREEN+"\t\t\t\t\t Illness: " +RESET+""+ patient.getIllness());
                            System.out.println();
                            System.out.println("\t\t\t\t\t - - - - - - - - - - - - - -");
                            System.out.println();
                        }
                    }
                    break;
                case 5:
                    System.out.println();
                    sleep.f();
                    System.out.println();
                    ArrayList<Doctor> doctorsData = hospital.getDoctorManager().getDoctors();
                    if (doctorsData.isEmpty()) {
                        System.out.println();
                        System.out.println(blink+GOLD+"\t\t\t\t\t\t\t No doctor data available."+RESET);
                        System.out.println();
                    } else {
                        System.out.println();
                        System.out.println(blink+BLUE+"\t\t\t\t\t\t Doctors Information:"+RESET);
                        System.out.println();
                        for (Doctor doctor : doctorsData) {
                            System.out.println(YELLOW+"\t\t\t\t\t Name: "+RESET+"" + doctor.getName());
                            System.out.println(YELLOW+"\t\t\t\t\t Specialization: " +RESET+""+ doctor.getSpecialization());
                            System.out.println(YELLOW+"\t\t\t\t\t Phone Number: " +RESET+""+ doctor.getPhoneNumber());
                            System.out.println();
                            System.out.println("\t\t\t\t\t - - - - - - - - - - - - - -");
                            System.out.println();
                        }
                    }
                    break;
                case 6:
                    System.out.println();
                    sleep.f();
                    System.out.println();
                    ArrayList<Appointment> appointmentsData = hospital.getAppointmentManager().getAppointments();
                    if (appointmentsData.isEmpty()) {
                        System.out.println();
                        System.out.println(blink+GOLD+"\t\t\t\t\t\t No appointment data available."+RESET);
                        System.out.println();
                    } else {
                        System.out.println();
                        System.out.println("\t\t\t\t\t\t Appointments Information:");
                        System.out.println();
                        for (Appointment appointment : appointmentsData) {
                            System.out.println(GREEN+"\t\t\t\t\t Patient: " +RESET+""+ appointment.getPatient().getName());
                            System.out.println(GREEN+"\t\t\t\t\t Doctor: " + RESET+""+appointment.getDoctor().getName());
                            System.out.println(GREEN+"\t\t\t\t\t Date: " +RESET+""+ appointment.getDate());
                            System.out.println();
                            System.out.println("\t\t\t\t\t - - - - - - - - - - - - - -");
                            System.out.println();
                        }
                    }
                    break;
                case 7:
                    System.out.println();
                    sleep.h();
                    System.out.println();

                    System.out.println(PURPLE+"\t\t\t\t\t\t\t\t Exiting the system. Goodbye!"+RESET);
                    System.out.println();
                    break;
                default:
                    System.out.println();
                    System.out.println();
                    sleep.f();
                    System.out.println();
                    System.out.println(blink+"\t\t\t\t\t\t Invalid choice. Please try again."+RESET);
                    System.out.println();
            }
        } while (choice != 7);

        scanner.close();
    }
}