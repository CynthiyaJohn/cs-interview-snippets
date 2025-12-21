import threading
import multiprocessing

def cpu_task():
    s = 0
    for i in range(10_000_000):
        s += i

if __name__ == "__main__":
    t = threading.Thread(target=cpu_task)
    p = multiprocessing.Process(target=cpu_task)

    t.start()
    t.join()

    p.start()
    p.join()
