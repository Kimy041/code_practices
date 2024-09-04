def solution(absolutes, signs):
    answer = []
    
    for i in range(len(absolutes)):
        answer.append(absolutes[i] if signs[i] else -absolutes[i])
        
    return sum(answer)