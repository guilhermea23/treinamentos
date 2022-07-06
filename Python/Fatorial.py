def fatorial(n):
    if n < 2:
        return 1
    else:
        return n*fatorial(n-1)


n = int(input())
nf = fatorial(n)
print(f"O fatorial de {n} é {nf}", end="")
