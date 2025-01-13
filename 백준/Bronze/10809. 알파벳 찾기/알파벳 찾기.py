lis = [-1]*26
S = input()

for i in range(len(S)):
    s_index = ord(S[i]) - ord('a')
    if lis[s_index] == -1:
        lis[s_index] = i

for num in lis:
    print(num, end=" ")