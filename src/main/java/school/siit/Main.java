package school.siit;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        Address a1 = new Address("Calea Surii Mici", 18, "Romania");

        ArrayList<Address> addresses = new ArrayList<>();
        addresses.add(a1);

        Hobby h1 = new Hobby("fishing", 10, addresses);

        ArrayList<Hobby> hobbies = new ArrayList<>();
        hobbies.add(h1);

        Person p1 = new Person("Simion", 28);
        Person p2 = new Person("Radu", 28);
        Person p3 = new Person("Stefana", 23);
        Person p4 = new Person("Cristian", 44);

        TreeSet<Person> listOfPersons = new TreeSet<Person>(new NameComparator());
        listOfPersons.add(p1);
        listOfPersons.add(p2);
        listOfPersons.add(p3);
        listOfPersons.add(p4);

        for (Person p : listOfPersons) {
            System.out.println(p.getName() + " " + p.getAge());
        }

        System.out.println("\n");

        TreeSet<Person> listOfPersonsAge = new TreeSet<Person>(new AgeComparator());
        listOfPersonsAge.add(p1);
        listOfPersonsAge.add(p2);
        listOfPersonsAge.add(p3);
        listOfPersonsAge.add(p4);

        for (Person p : listOfPersonsAge) {
            System.out.println(p.getName() + " " + p.getAge());
        }

        Address a2 = new Address("Calea Manastur", 76, "Romania");
        Address a3 = new Address("Via Machina", 70, "Italia");
        Address a4 = new Address("Deustche Strasse", 55, "Germania");
        Address a5 = new Address("Strada Mihai Viteazul", 13, "Romania");

        ArrayList<Address> addresses2 = new ArrayList<>();
        addresses2.add(a2);
        ArrayList<Address> addresses3 = new ArrayList<>();
        addresses3.add(a3);
        addresses3.add(a1);
        ArrayList<Address> addresses4 = new ArrayList<>();
        addresses4.add(a4);
        addresses4.add(a5);

        Hobby h2 = new Hobby("football", 30, addresses2);
        Hobby h3 = new Hobby("driving", 70, addresses3);
        Hobby h4 = new Hobby("computer progamming", 50, addresses4);

        ArrayList<Hobby> hobbiesP1 = new ArrayList<>();
        hobbiesP1.add(h1);
        hobbiesP1.add(h3);
        ArrayList<Hobby> hobbiesP2 = new ArrayList<>();
        hobbiesP2.add(h2);
        ArrayList<Hobby> hobbiesP3 = new ArrayList<>();
        hobbiesP3.add(h3);
        hobbiesP3.add(h2);
        ArrayList<Hobby> hobbiesP4 = new ArrayList<>();
        hobbiesP4.add(h4);

        HashMap<Person, List<Hobby>> personhobbiesHashMap = new HashMap<Person, List<Hobby>>();
        personhobbiesHashMap.put(p1, hobbiesP1);
        personhobbiesHashMap.put(p2, hobbiesP2);
        personhobbiesHashMap.put(p3, hobbiesP3);
        personhobbiesHashMap.put(p4, hobbiesP4);

        //for (Person p : personhobbiesHashMap.keySet()) {
        System.out.println("\n");
            for (Hobby h : personhobbiesHashMap.get(p1)) {
                System.out.print(h.getNameOfHobby() + " ");

                for (Address a : h.getAddresses()) {
                    System.out.print(a.getCountry() + " ");
                }

                System.out.print("\n");
            }
        }
    //}
}