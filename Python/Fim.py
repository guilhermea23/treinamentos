word = input("Insira uma palavra: ")
search = input(f"Insira uma (s) letra (s) p/ buscar em {word}: ")

if word.endswith(search):
    print(f"{search} está no final de {word}.")
elif word.startswith(search):
    print(f"{search} está no começo de {word}.")
