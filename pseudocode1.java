pseudocode
Stage 1
Read a three-digit integer
Determine if it is a palindrome integer

Stage 2
prompt the user to enter a three-digit integer
collect the number
save as userInput
calculate the userInput as:
num1 = userInput % 10
num2 = userInput % 100
num3 = num2 /10
num4 = num1 / 100
calculate palindrome as:
num1 == num4
collect result 
save as palindrome
display result