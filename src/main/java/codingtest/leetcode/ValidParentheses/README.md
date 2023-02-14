# LeetCode 20. Valid Parentheses
[문제 링크](https://leetcode.com/problems/valid-parentheses/)

### 문제 설명
괄호 사용이 올바른지 확인하는 문제

### 성능
Solution1 : runtime 9ms, memory 42.9MB (최악)

String을 스택처럼 사용한다.

substring의 잦은 사용으로 속도가 느려진 것으로 보

Solution2 : runtime 1ms, memory 40.6MB

Stack을 사용한 풀이.

---

Stack을 사용하는 문제인지 알았으나 java에서의 stack 사용이 익숙치않아 사용할 생각을 하지 못하였다.

그리고 String을 한 문자씩 배열로 바꾸어 줄때는 s.split("") 보다 s.toCharArray()를 사용하도록 하자!

