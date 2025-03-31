package org.example.oop.datastructures;

import java.util.*;

public class Rehearsal {
    public static HashSet<Integer> union(HashSet<Integer> A, HashSet<Integer> B) {
        HashSet<Integer> answer = new HashSet<>();
        for (int i : A) {
            if (B.contains(i)) {
                answer.add(i);
            }
        }
        return answer;
    }

    public static boolean podzbior(HashSet<Integer> A, HashSet<Integer> B) {
        return union(A, B).equals(A);
    }

    public static boolean isSubset(HashSet<Integer> A, HashSet<Integer> B) {
        return B.containsAll(A);
    }

    public static HashSet<Integer> sum(HashSet<Integer> A, HashSet<Integer> B) {
        HashSet<Integer> answer = new HashSet<>(A);
        answer.addAll(B);
        return answer;
    }

    public static void main(String[] args) {
        HashSet<Integer> A = new HashSet<>();
        HashSet<Integer> B = new HashSet<>();
        A.add(1);
//        A.add(2);
        A.add(3);
        B.add(1);
        B.add(3);
        B.add(4);
        System.out.println(union(A, B));
        System.out.println(podzbior(A, B));
    }


    public static HashSet<Integer> returnAsymetricDifference(HashSet<Integer> a, HashSet<Integer> b) {
        HashSet<Integer> commonPart = union(a, b);
        a.removeAll(commonPart);
        return a;
    }


    public static HashSet<Integer> simetricDifference(HashSet<Integer> A, HashSet<Integer> B) {
        HashSet<Integer> answer = sum(A, B);
        answer.removeAll(union(A, B));
        return answer;
    }

    public static HashMap<String, Integer> Zadanie9(List<String> input){
        HashMap<String, Integer> duplicates = new HashMap<>();

        for (int i = 0; i < input.size(); i++){
            int count = 0;
            String position = input.get(i);
            for (int j = 0; j < input.size(); j++) {
                if (position == input.get(j)) {
                    count++;
                }
            }
            if (count > 1){
                duplicates.put(position, count);
            }
        }
        return duplicates;
    }

    public static Map<String, Integer> Zadanie9Ulepszenie(List<String> list1){
        Set<String> set = new HashSet<>();
        Map<String, Integer> duplicates = new HashMap<>();

        for (String element : list1){
            if (!set.contains(element)){
                set.add(element);
            }
            else if (!duplicates.containsKey(element)){
                duplicates.put(element, 1);
            }
            else duplicates.put(element, duplicates.get(element) + 1);
        }

        return duplicates;
    }

    public static List<String> Zadanie10(List<String> A, List<String> B){
        Set<String> set = new HashSet<>(A);
        set.addAll(B);
        return new ArrayList<>(set);
    }
}