import sys
input = sys.stdin.readline

N = int(input())
G = list(map(int, input().split()))
G_M = max(G)
new_grad = [G[i]/G_M*100 for i in range(N)]

print(sum(new_grad)/N)