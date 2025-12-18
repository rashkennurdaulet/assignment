class Main {
    public static void main(String[] args) {
        Hospital myHospital = new Hospital("City Hospital №1", "ул. Абая 10");

        MedicalProfessional doctor = new MedicalProfessional("Доктор Нурдаулет", "Диагност");

        Patient patient1 = new Patient("Нурдаулет", 18, "Грипп");
        Patient patient2 = new Patient("Али", 17, "Ангина");
        Patient patient3 = new Patient("Рамазан", 17, "Перелом");

        myHospital.displayInfo();
        System.out.println(patient1.toString());
        System.out.println(patient2.toString());
        System.out.println(patient3.toString());

        doctor.treatPatient(patient1);


        if (patient1.getAge() > patient2.getAge()) {
            System.out.println(patient1.getName() + " старше, чем " + patient2.getName());
        } else {
            System.out.println(patient2.getName() + " старше или ровесник " + patient1.getName());
        }

        if (patient1.getName().equals(patient3.getName()) && patient1.getAge() == patient3.getAge()) {
            System.out.println("Пациент 1 и Пациент 3 имеют одинаковые данные.");
        }
    }
}