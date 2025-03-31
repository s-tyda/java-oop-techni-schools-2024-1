package org.example.oop.datastructures.librus;

import java.util.*;

public class Register {
    Map<String, List<Integer>> grades = new HashMap<>();

    public void add(String id, Integer grade){
        if (!grades.containsKey(id)){
            List<Integer> newGrades = new ArrayList<>();
            grades.put(id, newGrades);
        }
        grades.get(id).add(grade);
    }

    public void print(String id){
        System.out.println("styda oceny: " + grades.get(id));
    }

// HARD MODE: UŻYWAJ NA WŁASNĄ ODPOWIEDZIALNOŚĆ
    public double avg(String id){
        return grades.get(id).stream()
                .mapToDouble(Double::valueOf)
                .average()
                .getAsDouble();
    }

    public static void main(String[] args) {
        Register register = new Register();
        register.add("styda", 6);
        register.print("styda");
    }
}
