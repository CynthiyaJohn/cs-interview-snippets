import asyncio
import time

def sync_task():
    time.sleep(1)
    print("Sync done")

async def async_task():
    await asyncio.sleep(1)
    print("Async done")

sync_task()
asyncio.run(async_task())
