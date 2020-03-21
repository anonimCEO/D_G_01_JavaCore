package com.company;

import java.util.ArrayList;

public class DifferentObjects {

    static StringBuilder st = new StringBuilder();
    static ArrayList<Person> personArrayList = new ArrayList<>();
    static Long sum = 0L;
    public static void concatenate(ArrayList arr){
        for (Object object : arr) {

            if (object instanceof String || object instanceof Character) {
                if (st.length() > 0) {
                    st.append(" ").append(object);
                } else {
                    st.append(object);
                }
            } else if (object instanceof Long) {
                sum = sum + (Long) object;
            } else if (object instanceof Person) {

                personArrayList.add((Person) object);
            }
        }

        System.out.println("String: ");
        System.out.println(st);
        System.out.println("Sum: ");
        System.out.println(sum);
        System.out.println("Persons: ");
        for (Person person : personArrayList){
            System.out.println(person.getName() +" "+ person.getAge() +" "+ person.getGender());
        }
    }
}
