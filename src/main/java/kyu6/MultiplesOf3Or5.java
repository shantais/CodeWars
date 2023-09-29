package kyu6;

import java.util.ArrayList;
import java.util.List;

public class MultiplesOf3Or5 {
    public int solution(int givenNumber) {
        List<Integer> multiples = new ArrayList<>();
        for(int i=1; i<givenNumber/2; i++){
            if (3*i<givenNumber){
                multiples.add(3*i);
            }
            if (5*i<givenNumber){
                multiples.add(5*i);
            }
        }
        return multiples.stream().reduce(0, Integer::sum);
    }
}
