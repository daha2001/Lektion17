public class PersonDemo {
    public static void main(String[] args) {

        // Skapa instanser av klassen Person
        Person p1; // p1 är en referensvariabel
        p1 = new Person(); // ett objekt skapas

        // Skriv ut objektet
        //System.out.println(p1); // hashkod (Person@5f184fc6)
        //System.out.println(p1.firstName);    // null
        //System.out.println(p1.lastName);     // null
        //System.out.println(p1.dateOfBirth);  // null
        //System.out.println(p1.height);       // 0.0
        //System.out.println(p1.weight);       // 0.0

        // Ändra namnet
        p1.firstName = "daniel";
        p1.lastName = "håkansson";

        // Skriv ut hela namnet med hjälp av metod
        String name = Person.getName(p1);

        //System.out.println(Person.getName(p1)); // daniel håkansson
        //System.out.println(name); // daniel håkansson

        // Arbeta med ålder
        p1.dateOfBirth = "1988-01-14";
        Person.getAge(p1);
        System.out.println("ålder: " + Person.getAge(p1) + " år");

    }
}
