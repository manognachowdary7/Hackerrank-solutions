def fibonacii(n):
    sum = 0
    fib1, fib2 = 1, 2
    while fib2 <= n:
        if fib2 % 2 == 0:
            sum += fib2
        fib1, fib2 = fib2, fib1 + fib2
    return sum

t = int(input().strip())
for a0 in range(t):
    n = int(input().strip())
    res = fibonacii(n)
    print(res)
