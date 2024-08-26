def solution(numbers):
    length = len(numbers)
    total = 0

    for number in numbers:
        total += number

    answer = total/length
    return answer