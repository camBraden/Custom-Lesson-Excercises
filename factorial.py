number = int(input("Type in a number to get the factorial: "))
loop = number

while (loop >= 1):
    print(str(loop) + ": " + str(number))
    number = number * (loop - 1)
    loop -= 1
    
