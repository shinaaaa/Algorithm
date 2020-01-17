공간 복잡도 (Space Complexity)

- 얼마나 많은 공간이 필요한지

  > 시간 복잡도 (Time Complexity)
  >
  > - 얼마나 빠르게 실행되는지

- 프로그램 실행 및 완료하는데 필요한 저장공간의 양

- 필요 저장 공간

  > 고정 공간 : 코드 저장 공간, 단순 변수 및 상수
  >
  > 가변 공간 : 실행 중 동적으로 필요한 공간



공간 복잡도 계산

- 알고리즘에서 실제 사용되는 저장 공간을 계산

  > $S(P) = c +S_p(n)$ 
  >
  > - c : 고정 공간
  > - $S_p(n)$ : 가변 공간
  >
  > 빅오 표기법 (Big-O Notation) 을 사용하여 표현



```python
"""
공간 복잡도는 O(1)
n 값에 상관없이 변수 n, fac, index 만 필요
"""


def factorial(n):
    fac = 1
    for index in range(2, n+1):
        fac = fac * index
    return fac


result = factorial(3)
print(result)
```

