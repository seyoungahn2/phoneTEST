package Day20;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

class Solution{
    public int[] solution(String[] id_list, String[] report, int k){
        // 1. Map -> key : 신고당한사람 / value : 신고한 사람 List<>로 만들어서 여러명이 한 사람을 신고했을 때 신고자 모두 확인 가능
        HashMap<String, ArrayList<String>> map = new HashMap<>();

        // 2. Map -> key : muzi, frodo, apeach, neo / value : 신고 당한 횟수
        HashMap<String, Integer> send_map = new HashMap<>();

        // 맵 객체 생성

        for(String name : id_list){
            ArrayList<String > list = new ArrayList<>();
            map.put(name, list);
            send_map.put(name, 0);
        }

        for(int i = 0; i<report.length;i++){
            String[] temp = report[i].split(" ");
            String a = temp[0];  // 신고자
            String b = temp[1];  // 신고 당한자

            ArrayList<String > arr = map.get(b);

            if(arr.contains(a)){
                continue;
            }
            arr.add(a);
            map.put(b,arr);

        }

        for(String name : map.keySet()){
            ArrayList<String > arr = map.get(name);

            if(arr.size() >= k){
                for(int i = 0; i<arr.size();i++){
                    int count = send_map.get(arr.get(i))+1;
                    send_map.put(arr.get(i),count);

                }
            }
        }


        int[] answer = {};
        return answer;
    }
}





public class _02_Q1 {
    public static void main(String[] args) {
        Solution s = new Solution();

        String[] id = {"mizi", "frodo", "apeach", "neo"};
        String[] report = {"muzi frodo", "apeach frodo", "frodo neo", "muzi neo", "apeach muzi"};

        int[] a = s.solution(id, report, 1);
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
        // 2, 1, 1, 0 신고당한 횟수

    }
}

