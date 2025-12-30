#Concept: Default args evaluated once
import time

def show_time(ts=time.time()):
    print(ts)

show_time()
time.sleep(2)
show_time()
