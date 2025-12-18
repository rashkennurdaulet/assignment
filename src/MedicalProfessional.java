public class MedicalProfessional {
    private String name;
    private String specialization;

    public MedicalProfessional(String name, String specialization) {
        this.name = name;
        this.specialization = specialization;
    }

    public String getName() {
        return name;
    }

    public String getSpecialization() {
        return specialization;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSpecialization(String specialization) {
        this.specialization =  specialization;
    }

    public void treatPatient(Patient patient) {
        System.out.println("Доктор " + this.name + " начал лечение пациента " + patient.getName());
    }
}
