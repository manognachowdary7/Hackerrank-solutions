import math

def smallestMultiple(n):
    lcm = 1
    for i in range(1, n + 1):
        lcm = (lcm * i) // math.gcd(lcm, i)
    return lcm

t = int(input().strip())
for a0 in range(t):
    n = int(input().strip())
    res = smallestMultiple(n)
    print(res)
