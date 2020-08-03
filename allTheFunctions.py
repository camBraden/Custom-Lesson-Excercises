def compare(num1, num2):
    result = ""
    if (num1 > num2):
        result = str(num1) + " is greater than " + str(num2)
    elif (num2 > num1):
        result = str(num2) + " is greater than " + str(num1)
    else:
        result = "These numbers are equal."

    return result
def add(num1, num2):
    result = ""
    result = str(num1 + num2) + " is the sum."

    return result
def multiply(num1, num2):
    result = ""
    result = str(num1 * num2) + " is the product."

    return result
def divide(num1, num2):
    result = ""
    result = str(num1 / num2) + " is the quotient."

    return result


number1 = int(input("Enter number 1: "))
number2 = int(input("Enter number 2: "))
    
   
choice = input("Which operation would you like to perform? \n A. Compare \n B. Add \n C. Multipy \n D. Divide")
finalNum = ""
if (choice == "A" or choice == "a"):
    finalNum = compare(number1, number2)

if (choice == "B" or choice == "b"):
    finalNum = add(number1, number2)
    
if (choice == "C" or choice == "c"):
    finalNum = multiply(number1, number2)
    
if (choice == "D" or choice == "d"):
    if (number2 == 0):
        print("You cannot divide by 0")
    else:
        finalNum = divide(number1, number2)


print(finalNum)
running = input("Would you like to run again?")
        
