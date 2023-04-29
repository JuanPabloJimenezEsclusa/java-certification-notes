# 1Z0-819 notes

## Recap concepts

```txt
Deadlock: describes a situation where two or more threads are blocked forever, waiting for each other. For example,
two threads T1 and T2 need a File and a Printer. T1 acquires the lock for the file and is about to acquire the lock
for the Printer but before it could acquire the lock, T2 acquires the lock for the Printer and tries to acquire the
lock for the file (which is already held by T1). So now, both the threads keep waiting for ever for each other to
release their locks and neither will be able to proceed.
```

```txt
Starvation: describes a situation where a thread is unable to gain regular access to shared resources and is unable
to make progress. This happens when shared resources are made unavailable for long periods by "greedy" threads.
For example, suppose an object provides a synchronized method that often takes a long time to return.
If one thread invokes this method frequently, other threads that also need frequent synchronized access to the same
object will often be blocked.
```

```txt
Livelock: A thread often acts in response to the action of another thread. If the other thread's action is also a
response to the action of another thread, then livelock may result. As with deadlock, livelocked threads are unable to
make further progress. However, the threads are not blocked — they are simply too busy responding to each other
to resume work. For example, after acquiring the File lock, T1 tries to acquire the Printer lock. Finding the Printer
lock to be already taken, it releases the lock for the File and notifies T2. At the same time, T2 tries to acquire
the File lock and seeing that it is already taken it releases Printer lock and notifies T1. This process can go on
and on, both the threads releasing and acquiring the locks in tandem but none of them getting both the locks at the
same time. So neither of the threads is blocked but neither of the threads is able to do any real work. All they are
doing is notifying each other.
```

## References

* books:
  * OCP Oracle Certified Professional Java SE 11 Developer Complete Study Guide: Exam 1Z0-815, Exam 1Z0-816, and Exam 1Z0-817
  * OCP Oracle Certified Professional Java SE 11 Developer Practice Tests: Exam 1Z0-819 and Upgrade Exam 1Z0-817
* video chanel: [@LetsGetCertified](https://www.youtube.com/@LetsGetCertified)
* forum/simulator: [OCA OCP Java Programmer Certification Questions Discussion](https://enthuware.com/forum/viewforum.php?f=2)
