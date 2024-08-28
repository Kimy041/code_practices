def solution(s):
    answer = True
    p = s.lower().count('p')
    y = s.lower().count('y')
    
    if p == y:
        return True
    else:
        return False