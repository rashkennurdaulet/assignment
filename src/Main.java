public class Main {
    public static void main(String[] args) {

        Hospital hospital = new Hospital("City Hospital №1", "Abay street 10");

        MedicalProfessional doctor =
                new MedicalProfessional("Dr. Nurdaulet", 35, "Diagnostician");

        Patient p1 = new Patient("Sabyrzhan", 18, "flu disease");
        Patient p2 = new Patient("Ali", 17, "sore throat disease");
        Patient p3 = new Patient("Ramazan", 17, "fracture");

        hospital.addPatient(p1);
        hospital.addPatient(p2);
        hospital.addPatient(p3);

        doctor.treatPatient(p1);

        System.out.println("\nAll patients:");
        hospital.displayPatients();

        System.out.println("\nPatients over 17:");
        for (Patient p : hospital.filterByAge(18)) {
            System.out.println(p);
        }


        System.out.println("\nSearch for patient Ali:");
        System.out.println(hospital.searchByName("Ali"));

        System.out.println("\nSort by age:");
        hospital.sortByAge();
        hospital.displayPatients();
    }
}
