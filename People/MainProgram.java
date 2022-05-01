package People;

public class MainProgram {

    public static void main (String args[]){
        Person person = new Person();
        person.setFirstName("Ohmeko");
        person.setLastName("Ocampo");
        person.setAge(30);
        System.out.println(person.getFirstName());
        System.out.println(person.getLastName());
        System.out.println("Is the person a teen?: " + person.isTeen());
        System.out.println(person.getFullName());
    }

}
