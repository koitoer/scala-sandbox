name := "scala-ground"

version := "1.0"

scalaVersion := "2.11.8"

autoAPIMappings := true

lazy val akkaVersion = "2.4.4"

// Necessary for finagle-stats, which depends on com.twitter.common.metrics
resolvers += "Twitter's Repository" at "https://maven.twttr.com/"

scalacOptions ++= Seq("-feature", "-language:higherKinds")

libraryDependencies ++= Seq(
  "com.typesafe.akka" %% "akka-actor" % akkaVersion,
  "com.typesafe.akka" %% "akka-testkit" % akkaVersion,
  "org.scalatest" %% "scalatest" % "2.2.6" % "test",
  "junit" % "junit" % "4.12" % "test",
  "com.novocode" % "junit-interface" % "0.11" % "test",

  //Twitter finagle
  "com.twitter" %% "finagle-core" % "6.29.0",
  "com.twitter" %% "finagle-stats" % "6.29.0",
  "com.twitter" %% "finagle-thrift" % "6.29.0",
  "com.twitter" %% "scrooge-core" % "4.1.0",
  "com.twitter" %% "twitter-server" % "1.14.0",
  "org.apache.opennlp" % "opennlp-tools" % "1.6.0",
  "org.scalatest" %% "scalatest" %"2.2.5" % "test"

)

testOptions += Tests.Argument(TestFrameworks.JUnit, "-v")



