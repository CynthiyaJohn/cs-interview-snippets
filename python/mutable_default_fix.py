#Correct pattern for defaults
def add_item(item, container=None):
    if container is None:
        container = []
    container.append(item)
    return container

print(add_item(1))
print(add_item(2))
