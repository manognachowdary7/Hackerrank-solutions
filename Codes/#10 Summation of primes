from math import sqrt
from bisect import bisect

LIMIT = 2_000_000

S = [True] * LIMIT
primes = []
sums = [0]

for num in range(2, int(sqrt(LIMIT))):
    if S[num]:
        primes.append(num)
        sums.append(sums[-1] + num)
        for mul in range (num * num, LIMIT, num):
            S[mul] = False
for num in range(int(sqrt(LIMIT)), LIMIT):
    if S[num]:
        primes.append(num)
        sums.append(sums[-1] + num)


t = int(input())  # number of test cases

for a0 in range(t):
    n = int(input())  # input value for each test case
    result = bisect(primes, n)
    print(sums[result])
