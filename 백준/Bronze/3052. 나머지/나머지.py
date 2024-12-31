total = []

for _ in range(10):
    n = int(input())%42

    if n not in total:
        total.append(n)

print(len(total))