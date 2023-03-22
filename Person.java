package HomeWorkTasks;

import java.util.Objects;

public class Person {
    private String firstName;
    private String secondName;
    private int age;
    private int id;
    private String testSex;

    private Type sex;
    enum Type {
       MALE,
       FAMALE;
    }


    public Person(String name, String surname, int agePerson, int idPerson,Type sexPerson) {
        firstName = name;
        secondName = surname;
        age = agePerson  ;
        id = idPerson;
        sex = sexToSring(String.valueOf(sexPerson));
    }


    public String getFirstName() {
        return firstName;
    }

    public String getSecondName() {
        return secondName;
    }
        public int getId() {
        return id;
    }
public Type getSex(){
        return sex;
}
@Override
public String toString (){
        return String.format("Name: %s, Surname: %s, Age: %d, ID: %d", firstName, secondName, age, id);
}
public int getAge (){
        return age;
}
private  Type sexToSring (String sex) {
    if (sex == "male") {
        return Type.MALE;
    }
    if (sex == "female") {
        return Type.FAMALE;
    }return Type.FAMALE;
}
@Override
    public boolean equals(Object obj) {
        Person person = this;
        if (obj == null) {
            return false;
        }
        boolean objIsPerson = obj instanceof Person;
        if (!objIsPerson){
            return false;
        }
        Person anotherPerson = (Person) obj;
        return Objects.equals(firstName, anotherPerson.getFirstName()) && age == anotherPerson.getAge() && id == anotherPerson.getId() && sex == anotherPerson.getSex();
    }
    @Override
    public int hashCode () {
        return Objects.hash(firstName, age, id);
    }

    }