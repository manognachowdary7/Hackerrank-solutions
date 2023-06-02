def find_max_product(n, k, num):
    max_product = 0

    for i in range(n - k + 1):
        product = 1
        for j in range(i, i + k):
            product *= int(num[j])
        max_product = max(max_product, product)

    return max_product

t = int(input())  # number of test cases

for a0 in range(t):
    n, k = map(int, input().split())  # n is the number of digits, k is the number of consecutive digits
    num = input().strip()  # input digit number as a string
    result = find_max_product(n, k, num)
    print(result)
