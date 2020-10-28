import java.util.Calendar;

public class Person {

    // Instansvariabler / fält (field) / egenskaper / attribut
    String firstName;
    String lastName;
    String dateOfBirth; // YYYY-MM-DD
    double height; // meter
    double weight; // kg

    // Metoder / operationer / funktioner

    /**
     * En klassmetod som returnerar hela namnet
     * @param p är en instans av klassen Person
     * @return namnet (förnamn + efternamn)
     */
    public static String getName(Person p){
        return p.firstName + " " + p.lastName;
    }

    /**
     * getAge är en klassmetod som beräknar ålder
     * @param p är en referens till ett objekt av typen Person
     * @return ålder
     */
    public static int getAge(Person p){
        // Hämta aktuellt år
       String calendar = Calendar.getInstance().getTime().toString();
        //System.out.println(calendar);
        String thisYearString = calendar.substring(calendar.lastIndexOf(' ')+1);
        //System.out.println(thisYearString);
        int thisYear = Integer.parseInt(thisYearString);
        //System.out.println(thisYear);

        // Hämta år från dateOfBirth (1988-01-14)
        String yearString = p.dateOfBirth.substring(0, 4);
        int year = Integer.parseInt(yearString);
        //System.out.println(year);

        // Aktuellt år - år t.ex. 2020-1988 = 32
        int age = thisYear -year;
        //System.out.println(age);

        return age;
    }

    /**
     * En klassmetod som beräknar BMI
     * @param p är en referensvariabel av typen Person
     * @return BMI
     */
    public static double getBMI(Person p){
        // BMI = vikt / (längd * längd)
        return p.weight / (p.height * p.height);
    }

    /**
     *  En klassmetod som returnerar viktklassen
     * @param p är en person
     * @return viktklassen
     */
    public static String getBMICategory(Person p){

        double BMI = Person.getBMI(p);

        String category;
        if(BMI < 18.5)
            category = "undervikt";
        else if(BMI < 25)
            category = "Normalvikt";
        else
            category = "Övervikt";

        return category;
    }
}
