#Boolean evaluation
values = [0, "", [], None, {}, 1, "hi"]

for v in values:
    if v:
        print(v, "is Truthy")
    else:
        print(v, "is Falsy")
