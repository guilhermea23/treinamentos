letters = [x for x in input().split()]
print("Letter -> Value in table ASCII")
for letter in letters:
    print(letter, "->", ord(letter))
