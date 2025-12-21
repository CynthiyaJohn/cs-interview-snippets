try:
    d = {}
    key = [1, 2, 3]
    d[key] = "value"
except TypeError as e:
    print(e)
