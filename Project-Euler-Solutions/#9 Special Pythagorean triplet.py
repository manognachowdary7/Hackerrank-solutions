t = int(input().strip())
for a0 in range(t):
    n = int(input().strip())
    triplet = -1
    for a in range(1, n // 3 + 1):
        b = (n * n - 2 * n * a) // (2 * n - 2 * a)
        c = n - a - b

        if a * a + b * b == c * c:
            product = a * b * c
            
            if product > triplet:
                triplet = product
    
    print(triplet)
