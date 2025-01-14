count = int(input())
total = []

for _ in range(count):
    number = int(input())
    if number == 0:
        total.pop()
    else:
        total.append(number)

print(sum(total))