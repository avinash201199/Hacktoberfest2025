import time

def stopwatch():
    input("Press Enter to start the stopwatch")
    start_time = time.time()
    print("Stopwatch started...")

    input("Press Enter to stop the stopwatch")
    end_time = time.time()

    elapsed_time = end_time - start_time
    print(f"Elapsed time: {elapsed_time:.2f} seconds")

if __name__ == "__main__":
    stopwatch()
