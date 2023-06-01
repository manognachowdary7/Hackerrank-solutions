def multiples(n):
    n -= 1
    sum3 = (3*(n // 3) * ((n // 3) + 1)) // 2
    sum5 = (5*(n // 5) * ((n // 5) + 1)) // 2
    sum15 = (15*(n // 15) * ((n // 15) + 1)) // 2
    totalsum = sum3 + sum5 - sum15
    return totalsum

t = int(input().strip())
for a0 in range(t):
    n = int(input().strip())
    res = multiples(n)
    print(res)
