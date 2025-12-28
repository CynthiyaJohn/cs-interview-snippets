#Concept: Late binding in closures
funcs = []

for i in range(3):
    funcs.append(lambda: i)

for f in funcs:
    print(f())

#Key idea: Closures capture variables, not values.
