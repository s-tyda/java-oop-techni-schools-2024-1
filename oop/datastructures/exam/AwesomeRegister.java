package org.example.oop.datastructures.exam;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class AwesomeRegister {
    Map<String, Map<String, List<Integer>>> students = new HashMap<>();

    public void add(String student, String subject, int grade){
//        if (!students.containsKey(student)){
//            students.put(student, new HashMap<>());
//        }
//        if (!students.get(student).containsKey(subject)){
//            students.get(student).put(subject, new ArrayList<>());
//        }
        students.get(student).get(subject).add(grade);
    }

    public static void main(String[] args) {
        AwesomeRegister awesomeRegister = new AwesomeRegister();
        awesomeRegister.add("seba", "przyrka", 6);
    }
}
