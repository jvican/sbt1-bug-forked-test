# Reproduction

1. Change the `javaHome` to the correct JDK directory in your system.
2. Run `sbt test`.

# Error

You should see something like this:

```
sbt @ fork-test-error > test
[info] Updating {file:/data/rw/code/scala/repros/fork-test-error/}fork-test-error...
[info] Done updating.
[info] Compiling 1 Scala source to /data/rw/code/scala/repros/fork-test-error/target/scala-2.12/test-classes ...
[info] Done compiling.
[error] Error: Total 0, Failed 0, Errors 0, Passed 0
[error] Error during tests:
[error] 	Forked test harness failed: java.net.SocketException: Connection reset
[error] 	at java.net.SocketInputStream.read(SocketInputStream.java:210)
[error] 	at java.net.SocketInputStream.read(SocketInputStream.java:141)
[error] 	at java.net.SocketInputStream.read(SocketInputStream.java:224)
[error] 	at java.io.ObjectInputStream$PeekInputStream.peek(ObjectInputStream.java:2598)
[error] 	at java.io.ObjectInputStream$BlockDataInputStream.readBlockHeader(ObjectInputStream.java:2792)
[error] 	at java.io.ObjectInputStream$BlockDataInputStream.refill(ObjectInputStream.java:2862)
[error] 	at java.io.ObjectInputStream$BlockDataInputStream.skipBlockData(ObjectInputStream.java:2764)
[error] 	at java.io.ObjectInputStream.skipCustomData(ObjectInputStream.java:2196)
[error] 	at java.io.ObjectInputStream.readNonProxyDesc(ObjectInputStream.java:1838)
[error] 	at java.io.ObjectInputStream.readClassDesc(ObjectInputStream.java:1713)
[error] 	at java.io.ObjectInputStream.readArray(ObjectInputStream.java:1888)
[error] 	at java.io.ObjectInputStream.readObject0(ObjectInputStream.java:1529)
[error] 	at java.io.ObjectInputStream.readObject(ObjectInputStream.java:422)
[error] 	at sbt.React.react(ForkTests.scala:156)
[error] 	at sbt.ForkTests$Acceptor$2$.run(ForkTests.scala:96)
[error] 	at java.lang.Thread.run(Thread.java:748)
[error] (test:test) sbt.TestsFailedException: Tests unsuccessful
[error] Total time: 4 s, completed Oct 19, 2017 6:18:27 PM
sbt @ fork-test-error > %                                    
```
