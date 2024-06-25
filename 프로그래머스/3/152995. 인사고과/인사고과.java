import java.util.*;

class Solution {
    public int solution(int[][] scores) {
        final List<Person> people = new ArrayList<>();
        final List<Person> resultPeople = new ArrayList<>();
        
        int answer = -1;
        int wanhoSumScore = scores[0][0] + scores[0][1];
        
        for(int i = 0; i < scores.length; i++){
            if(wanhoSumScore <= scores[i][0] + scores[i][1]){
                people.add(new Person(i, scores[i][0], scores[i][1], scores[i][0] + scores[i][1]));    
            }
        }
        
        Collections.sort(people, (a, b) -> { 
            if(b.attitudeScore != a.attitudeScore){
                return b.attitudeScore - a.attitudeScore;
            } else {
                return a.valueScore - b.valueScore;
            }
        });
        
        for(int i = 0; i < people.size(); i++){
            final Person target = people.get(i);
            boolean flag = false;
            
            for(int j = 0; j < people.size(); j++){
                if(i != j){
                    final Person retry = people.get(j);
                    
                    if(target.attitudeScore < retry.attitudeScore){
                        if(target.attitudeScore < retry.attitudeScore && target.valueScore < retry.valueScore){
                            flag = true;
                            break;
                        }
                    } else {
                        break;
                    }
                }
            }
            
            if(!flag){
                resultPeople.add(target);
            }
        }
        
        Collections.sort(resultPeople, (a, b) -> b.sumScore - a.sumScore);
        
        for(int i = 0; i < resultPeople.size(); i++){
            if(resultPeople.get(i).id == 0){
                answer = i + 1;
            }
        }
        
        return answer;
    }
    
    static class Person{
        private int id;
        private int attitudeScore;
        private int valueScore;
        private int sumScore;
        
        Person(int id, int attitudeScore, int valueScore, int sumScore){
            this.id = id;
            this.attitudeScore = attitudeScore;
            this.valueScore = valueScore;
            this.sumScore = sumScore;
        }
        
    }
}