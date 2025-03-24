import java.util.Objects;

public class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Person person = (Person) obj;
        return age == person.age && Objects.equals(name, person.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }

    public static void main(String[] args) {
        Person personA = new Person("John", 25);
        Person personB = new Person("John", 25);
        Person personC = new Person("John", 25);
        Person personD = new Person("Jane", 30);

        // Symmetry: a.equals(b) should be same as b.equals(a)
        System.out.println("Symmetry:");
        System.out.println("personA.equals(personB): " + personA.equals(personB));  // true
        System.out.println("personB.equals(personA): " + personB.equals(personA));  // true
        System.out.println();

        // Transitivity: If a.equals(b) and b.equals(c) then a.equals(c)
        System.out.println("Transitivity:");
        System.out.println("personA.equals(personB): " + personA.equals(personB));  // true
        System.out.println("personB.equals(personC): " + personB.equals(personC));  // true
        System.out.println("personA.equals(personC): " + personA.equals(personC));  // true
        System.out.println();

        // Reflexivity: a.equals(a) should always be true
        System.out.println("Reflexivity:");
        System.out.println("personA.equals(personA): " + personA.equals(personA));  // true
        System.out.println();

        // Null check: a.equals(null) should always be false
        System.out.println("Null check:");
        System.out.println("personA.equals(null): " + personA.equals(null));        // false
        System.out.println();

        // Consistency of hashCode:
        System.out.println("Consistency of hashCode:");
        System.out.println("personA.hashCode(): " + personA.hashCode());
        System.out.println("personB.hashCode(): " + personB.hashCode());
        System.out.println("personA.equals(personB): " + personA.equals(personB));  // true
        System.out.println("personA.hashCode() == personB.hashCode(): " + (personA.hashCode() == personB.hashCode()));  // true
        System.out.println();

        // Same hashCode, different objects
        System.out.println("Same hashCode, different objects:");
        System.out.println("personA.hashCode(): " + personA.hashCode());
        System.out.println("personD.hashCode(): " + personD.hashCode());
        System.out.println("personA.equals(personD): " + personA.equals(personD));  // false
    }
}
