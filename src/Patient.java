public class Patient {
    private String name;
    private int age;
    private String diagnosis;

    public Patient(String name, int age, String diagnosis) {
        this.name = name;
        this.age = age;
        this.diagnosis = diagnosis;
    }
    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }
    public String getDiagnosis() {
        return diagnosis;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public void setDiagnosis(String diagnosis) {
        this.diagnosis = diagnosis;
    }

    .+
            .
    public String toString() {
        return "Пациент: " + name + ", Возраст: " + age + ", Диагноз: " + diagnosis;
    }
}