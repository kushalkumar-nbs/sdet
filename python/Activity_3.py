# Get the users names
user1 = input("What is Player 1's name? ")
user2 = input("What is Player 2's name? ")
 
# Get the users choices
user1_answer = input(user1 + ", do you want to choose rock, paper or scissors? ").lower()
user2_answer = input(user2 + ", do you want to choose rock, paper or scissors? ").lower()

if user1_answer==user2_answer:
    print("It is a tie")
elif user1_answer=='rock':
    if user2_answer=='scissors':
        print("rock wins")
    else:
        print("paper wins")
elif user1_answer=="scissors":
    if user1_answer=="paper":
        print("scissors win")
    else:
        print("Rock Wins")
elif user1_answer=="paper":
    if user1_answer=="rock":
        print("Paper wins")
    else:
        print("scissors wins")
else:
    print("Invalid input! You have not entered rock, paper or scissors, try again.")