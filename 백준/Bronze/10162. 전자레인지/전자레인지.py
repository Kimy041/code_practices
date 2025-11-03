N = int(input())

count = [0] * 3

while N >= 0:
    if N % 300 == 0:
        count[0] += N // 300
        break
    elif N % 60 == 0:
        count[1] += N // 60
        break
    N -= 10
    count[2] += 1
else:
    count = 0

if count == 0:
    print(-1)
else:
    for i in count:
        print(i, end=" ")