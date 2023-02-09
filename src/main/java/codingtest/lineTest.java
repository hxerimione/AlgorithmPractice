package codingtest;

import java.util.*;

public class lineTest {
    public static int[] solution(int[] cards, String[] shuffles){
        int[] answer = {};
        int len = cards.length/2;
        for (int i = 0; i < shuffles.length; i++) {
            int[] arr1 = Arrays.copyOfRange(cards, 0, len);
            int[] arr2 = Arrays.copyOfRange(cards, len, cards.length);
            if (shuffles[i].equals("Riffle")){
                for (int j = cards.length; j >0 ; j-=2) {
                    cards[j-1] = arr1[j/2-1];
                    cards[j-2] = arr2[j/2-1];
                }


            }else{
                System.arraycopy(arr2, 0, cards, 0, len);
                System.arraycopy(arr1, 0, cards, len, len);
            }

        }
        answer = cards;
        return answer;
    }
    public static void main(String[] args) {
//        int[] cards = {2,3,6,5,4,1};
//        String[] shuffles = {"Cut","Riffle","Cut"};
//        int[] result = solution(cards,shuffles);
//        for (int j = 0; j < cards.length; j++) {
//            System.out.println(cards[j]);
//        }
        String[] people = {"A 1 2","B 2 3 4","C 4 5","D 5 6 7","E 6 7 8","F 8 9"};
        String[] pairs={"A B","C F"};
        int[] result = solution2(9,people,pairs);
    }
    public static int[] solution2(int m, String[] people, String[] pairs){
        ArrayList<String> al;
        HashMap<Integer, ArrayList<String>> map = new HashMap<>();
        for (int i = 0; i < people.length; i++) {
            String[] person = people[i].split(" ");


            for (int j = 1; j < person.length; j++) {
                al = new ArrayList<>();
                if(map.containsKey(Integer.parseInt(person[j]))){
                    map.get(Integer.parseInt(person[j])).add(person[0]);
                }else{
                    al.add(person[0]);
                    map.put(Integer.parseInt(person[j]),al);
                }
            }
        }
        class Node{
            String Per;
            ArrayList<String> link;

            public String getPer() {
                return Per;
            }

            public void setPer(String per) {
                Per = per;
            }

            public ArrayList<String> getLink() {
                return link;
            }

            public void setLink(ArrayList<String> link) {
                this.link = link;
            }
        }

        Set<Integer> keySet = map.keySet();
        for (Integer key : keySet) {

        }
        int[] answer ={};
        return answer;
    }


}
