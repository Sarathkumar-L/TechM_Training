import java.util.Objects;

class Person {
    private String fullName;
    private int yearsOld;

    public Person(String fullName, int yearsOld) {
        this.fullName = fullName;
        this.yearsOld = yearsOld;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public int getYearsOld() {
        return yearsOld;
    }

    public void setYearsOld(int yearsOld) {
        this.yearsOld = yearsOld;
    }

    @Override
    public String toString() {
        return "Person{fullName='" + fullName + "', yearsOld=" + yearsOld + "}";
    }

    @Override
    public int hashCode() {
        return Objects.hash(fullName, yearsOld);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null || getClass() != obj.getClass())
            return false;
        Person person = (Person) obj;
        return yearsOld == person.yearsOld && Objects.equals(fullName, person.fullName);
    }
}

class AlternatePerson {
    private String fullName;
    private int yearsOld;

    public AlternatePerson(String fullName, int yearsOld) {
        this.fullName = fullName;
        this.yearsOld = yearsOld;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public int getYearsOld() {
        return yearsOld;
    }

    public void setYearsOld(int yearsOld) {
        this.yearsOld = yearsOld;
    }
}

public class PersonComparison {
    public static void main(String[] args) {
        Person person1 = new Person("Alice", 30);
        Person person2 = new Person("Alice", 30);
        AlternatePerson altPerson1 = new AlternatePerson("Alice", 30);
        AlternatePerson altPerson2 = new AlternatePerson("Alice", 30);

        System.out.println("Person objects:");
        System.out.println(person1);
        System.out.println(person2);
        System.out.println("person1 equals person2: " + person1.equals(person2));

        System.out.println("\nAlternatePerson objects:");
        System.out.println(altPerson1);
        System.out.println(altPerson2);
        System.out.println("altPerson1 equals altPerson2: " + altPerson1.equals(altPerson2));
    }
}
