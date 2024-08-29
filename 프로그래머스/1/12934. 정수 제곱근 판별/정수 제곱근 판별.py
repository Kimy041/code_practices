import math

def solution(n):
    num = math.sqrt(n)
    
    return (num+1)**2 if num.is_integer() else -1