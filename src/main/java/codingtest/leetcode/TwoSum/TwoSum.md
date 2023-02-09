# LeetCode 1.Two Sum
[문제 링크](https://leetcode.com/problems/two-sum/)
### 문제 설명
int배열에서 두 수의 합이 target일 때,

이 두 수의 index를 배열로 반환하는 문제이다.

### 성능
solution1 : runtime 71ms , memory : 42.6MB

완전탐색을 이용한 풀이(이중for문)

시간복잡도 : 최악의 경우 O(n^2)

공간복잡도 : 추가 할당하여 사용하는 공간 없으므로 O(1)

solution2 : runtime 1ms , memory : 42.4MB

해당 보수값(target에서 뺀 값)을 key로, index를 value로 설정하고

반복문을 돌며 현재값과 일치하는 key값이 있는지 확인한다.

시간복잡도 : O(n)

공간복잡도 : hashmap에 저장하기 때문에 O(n)
