def solution(a, b):
    answer = 0
    m = a if a>b else b
    s = a if a<b else b
    
    if a == b :
        return a
    else:
        for i in range(s, m+1):
            answer += i
    
    return answer