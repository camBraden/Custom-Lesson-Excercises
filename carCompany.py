minivanBase = 40000 #300
minivanBetter = 50000 #315
minivanBest = 60000 #330
truckBase = 60000 #400
truckBetter = 70000 #425
truckBest = 80000 #450
sportsCarBase = 80000 #500
sportsCarBetter = 90000 #550
sportsCarBest = 100000 #600

price = 0

print("1. Minivan: \n- This vehicle has 7 seats and between 300 and 330 horsepower. \n- (1) The Base trim ($40,000) comes with 300 hp and cloth seats. \n- (2) The Better trim ($50,000) comes with 315 hp and leather seats. \n- (3) The Best trim ($60,000) comes with 330 hp and heated leather seats.")
print("2. Truck: \n- This vehicle has 4 seats and between 400 and 450 horsepower. \n- (1) The Base trim ($60,000) comes with 400 hp and cloth seats. \n- (2) The Better trim ($70,000) comes with 425 hp and leather seats. \n- (3) The Best trim ($80,000) comes with 450 hp and heated leather seats.")
print("3. Sports Car: \n- This vehicle has 2 seats and between 500 and 600 horsepower. \n- (1) The Base trim ($80,000) comes with 500 hp and cloth seats. \n- (2) The Better trim ($90,000) comes with 550 hp and leather seats. \n- (3) The Best trim ($100,000) comes with 600 hp and heated leather seats.")
print()

style = input("Which car would you like to buy? ")
print()

if (style == "1"):
    style = "Minivan"
    color = input("What color would you like your car to be? ")
    print()
    trim = input ("Which trim level would you like? ")
    if (trim == "1"):
        trim = "Base"
        price = 40000
    if (trim == "2"):
        trim = "Better"
        price = 50000
    if (trim == "3"):
        trim = "Best"
        price = 60000
if (style == "2"):
    style = "Truck"
    color = input("What color would you like your car to be? ")
    print()
    trim = input ("Which trim level would you like? ")
    if (trim == "1"):
        trim = "Base"
        price = 60000
    if (trim == "2"):
        trim = "Better"
        price = 70000
    if (trim == "3"):
        trim = "Best"
        price = 80000
if (style == "3"):
    style = "Sports Car"
    color = input("What color would you like your car to be? ")
    print()
    trim = input ("Which trim level would you like? ")
    if (trim == "1"):
        trim = "Base"
        price = 80000
    if (trim == "2"):
        trim = "Better"
        price = 90000
    if (trim == "3"):
        trim = "Best"
        price = 100000

print()

class Vehicle:
    def __init__(car, style, color, trim):
        car.carType = style
        car.carColor = color
        car.carTrim = trim




usersCar = Vehicle(style, color, trim)

print("You chose the " + usersCar.carTrim + " " + usersCar.carType + "\nYour color is " + usersCar.carColor)
print("Your price is $" + str(price))

secondCar = Vehicle("Spaceship", "White", "Supreme")

print(secondCar.carType + secondCar.carColor + secondCar.carTrim)
   
    
  






        
