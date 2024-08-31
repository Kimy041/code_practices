def solution(x):
    total = 0
    
    for n in str(x):
        total += int(n)
    
    return (True if x%total == 0 else False )