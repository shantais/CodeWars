package kyu6;

import java.util.LinkedHashSet;
import java.util.Set;

public class MultiplesOf3Or5 {
    public int solution(int givenNumber) {
        Set<Integer> multiples = new LinkedHashSet<>();
        for(int i=1; i<givenNumber/2; i++){
            if (3*i<givenNumber){
                multiples.add(3*i);
            }
            if (5*i<givenNumber){
                multiples.add(5*i);
            }
        }
        return multiples.stream().reduce(0, (a,b)->a+b);
    }
}
