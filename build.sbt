name := "bug forked test"
fork in Test := true
javaHome in Test := Some(file("/usr/lib/jvm/java-7-openjdk"))
libraryDependencies ++= List(
  "org.specs2" %% "specs2-core" % "3.9.1" % Test,
  "org.specs2" %% "specs2-scalacheck" % "3.9.1" % Test
)
