# LeetCode 13.Roman to Integer
[문제 링크](https://leetcode.com/problems/roman-to-integer/)
### 문제 설명
로마 숫자는 I, V, X, L, C, D, M의 7가지 기호로 표현된다.

로마 숫자들은 보통 왼쪽에서 오른쪽으로 가장 큰 것부터 작은 것까지 쓰여진다.

그러나 4의 숫자는 III가 아니다. 대신 IV로 표기된다.

왜냐하면 4는 5(V)의 1(I)을 뺀 수이기 때문이다. IX로 표기된 숫자 9도 같은 원리가 적용된다.

### 성능
solution : runtime 6ms , memory : 43MB

hashmap에 로마자와 대응하는 숫자값을 넣어준다.

문자열의 끝부터 처음까지 순서대로 대응되는 값을 찾는데,

왼쪽에 있는 값이 오른쪽보다 작다면 빼주고 크다면 더해주는 방식으로 구현하였다.
