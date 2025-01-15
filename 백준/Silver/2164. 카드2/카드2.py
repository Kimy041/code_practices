import sys
from collections import deque

num = int(sys.stdin.readline())
queue = deque([i+1 for i in range(num)])

while True:
    if len(queue) == 1:
        break
        
    queue.popleft()
    queue.rotate(-1)

print(queue[0])