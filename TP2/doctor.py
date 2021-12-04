T = int(input())
for i in range(T):
    N = int(input())
    patients = []
    for j in range(N):
        patients.append([int(x) for x in input().split()].append(j+1))
    print(patients)
    patients.sort(key=lambda x: x[0] * 100000 + x[1] - x[0])
    orderedPatients = ""
    for j in range(len(patients)):
        if patients[j][1] > j + 1:
            orderedPatients = "impossible"
            break
        else:
            orderedPatients += patients[j][2] + " "
    print(orderedPatients)
