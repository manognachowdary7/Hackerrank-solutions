def largestPrimeFactor(n):
    factor = 2
    while factor * factor <= n:
        if n % factor == 0:
            n //= factor
        else:
            factor += 1
    return n

t = int(input().strip())
for a0 in range(t):
    n = int(input().strip())
    res = largestPrimeFactor(n)
    print(res)
