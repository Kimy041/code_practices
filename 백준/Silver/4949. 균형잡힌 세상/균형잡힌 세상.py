while True:
    word = []
    sentences = input()

    if sentences == '.':
        break

    for w in sentences:
        if w == "(" or w == "[":
            word.append(w)
        if w == ")":
            if len(word) != 0 and word[-1] == "(":
                word.pop()
            else:
                word.append(w)
                break
        if w == "]":
            if len(word) != 0 and word[-1] == "[":
                word.pop()
            else:
                word.append(w)
                break

    if len(word) == 0:
        print("yes")
    else:
        print("no")