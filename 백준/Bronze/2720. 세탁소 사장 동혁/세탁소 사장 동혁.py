M = int(input())

for _ in range(M):
    money = int(input())

    Q = money // 25
    money %= 25
    D = money // 10
    money %= 10
    N = money // 5
    money %= 5
    P = money // 1

    print(Q, D, N, P)