from itertools import combinations

heights = []

for _ in range(9):
    heights.append(int(input()))

for combibation in combinations(heights, 7):
    if sum(combibation) == 100:
        combibation = sorted(combibation)
        for heigh in combibation:
            print(heigh)
        break