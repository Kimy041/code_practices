def solution(babbling):
    x     = ["aya", "ye", "woo", "ma"]
    count = 0

    for word in babbling:
        for baby in x:
            word = word.replace(baby, " ")
        word = word.replace(" ", "")
        if (word == ''):
            count = count + 1
    
    return count