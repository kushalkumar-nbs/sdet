	
username = input("Enter username:")
userAge= int(input("enter your age:"))
print(type(userAge)) 
ageNew= str((2021-userAge)+100)
print("Username is: " + username)
txt = ("You will turn to 100 Years on {}")
print(txt.format(ageNew)) 
