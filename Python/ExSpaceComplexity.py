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
