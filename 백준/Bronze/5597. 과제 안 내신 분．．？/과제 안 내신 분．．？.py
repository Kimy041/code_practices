students = [i for i in range(1, 31)]

is_done = True
while is_done:
    student = int(input())
    students.remove(student)

    if len(students) == 2:
        is_done = False

for i in students:
    print(i)