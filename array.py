import random

randomArray = [0]

numOfNum = int(input("Enter the amount of numbers: "))

numRange = int(input("Enter the range of numbers: "))

index = 0

while (index < numOfNum):
    randomArray[index] = random.randint(1, numRange)
    randomArray.append(randomArray[index])
    index += 1

randomArray.remove(randomArray[index])

print(randomArray) 
