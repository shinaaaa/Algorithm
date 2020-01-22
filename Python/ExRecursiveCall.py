def factorial(num):
    if num > 1:
        return num * factorial(num-1)
    else:
        return num


data = int(input())

for num in range(data):
    print(factorial(num))
