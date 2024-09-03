import re

#def checkPalindome(str1, str2):
 #   str1 = str1.Reversed()
  #  print(str1)


phrase1 = input("Write the first phrase: ")

#gets rid of space
phrase1 = re.sub(' ', '',phrase1)

#reverses the string
checkPal = phrase1[::-1]


if checkPal == phrase1:
    print("It is a palindrome!")
else:
    print("It is not a palindrome!")

#checkPalindome(phrase1, phrase2)

