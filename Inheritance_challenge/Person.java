//  81 Create a class Person with attributes name and age. Override equals() to compare Person objects based on their attributes. Override hashCode() consistent with the definition of equals().

package Inheritance_challenge;

public class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((name == null) ? 0 : name.hashCode());
        result = prime * result + age;
        return result;
    }

    @Override
    public boolean equals(Object obj) {

        if (this == obj)
            return true;

        if (!(obj instanceof Person))
            return false;

        Person other = (Person) obj;

        return age == other.age && name.equals(other.name);
    }

    public static void main(String[] args) {
        Person p1 = new Person("Bill", 75);
        Person p3 = new Person("Bill", 75);
        Person p2 = new Person("elon", 55);

        System.out.println(p1.equals(p2));
        System.out.println(p1.equals(p3));
    }

}
