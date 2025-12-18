public class MedicalProfessional extends Person {
    private String specialization;

    public MedicalProfessional(String name, int age, String specialization) {
        super(name, age);
        this.specialization = specialization;
    }

    public void treatPatient(Patient patient) {
        System.out.println("Doctor " + name + " treats patient " + patient.getName());
    }

    @Override
    public String getRole() {
        return "Medical Professional";
    }

    @Override
    public String toString() {
        return "Doctor{name='" + name + "', specialization='" + specialization + "'}";
    }
}
