import java.util.*;

public class Hospital {
    private String name;
    private String address;
    private List<Patient> patients = new ArrayList<>();

    public Hospital(String name, String address) {
        this.name = name;
        this.address = address;
    }

    public void addPatient(Patient patient) {
        patients.add(patient);
    }

    public Patient searchByName(String name) {
        for (Patient p : patients) {
            if (p.getName().equalsIgnoreCase(name)) {
                return p;
            }
        }
        return null;
    }

    public List<Patient> filterByAge(int minAge) {
        List<Patient> result = new ArrayList<>();
        for (Patient p : patients) {
            if (p.getAge() >= minAge) {
                result.add(p);
            }
        }
        return result;
    }

    public void sortByAge() {
        patients.sort(Comparator.comparingInt(Patient::getAge));
    }

    public void displayPatients() {
        for (Patient p : patients) {
            System.out.println(p);
        }
    }
}
