def largestPalindromeProduct(n):
    palindrome = 0
    for i in range(999, 99, -1):
        for j in range(i, 99, -1):
            product = i * j
            if product < n and str(product) == str(product)[::-1] and product > palindrome:
                palindrome = product
    return palindrome

t = int(input().strip())
for a0 in range(t):
    n = int(input().strip())
    res = largestPalindromeProduct(n)
    print(res)
