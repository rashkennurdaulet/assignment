import java.util.Objects;

public class Patient extends Person {
    private String diagnosis;

    public Patient(String name, int age, String diagnosis) {
        super(name, age);
        this.diagnosis = diagnosis;
    }

    public String getDiagnosis() {
        return diagnosis;
    }

    public void setDiagnosis(String diagnosis) {
        this.diagnosis = diagnosis;
    }

    @Override
    public String getRole() {
        return "Patient";
    }

    @Override
    public String toString() {
        return "Patient{name='" + name + "', age=" + age + ", diagnosis='" + diagnosis + "'}";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Patient)) return false;
        Patient patient = (Patient) o;
        return age == patient.age &&
                Objects.equals(name, patient.name) &&
                Objects.equals(diagnosis, patient.diagnosis);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, diagnosis);
    }
}
