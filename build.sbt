name := "dtwt"

version := "0.1"

scalaVersion := "2.12.8"

scalacOptions += "-Ypartial-unification"

//wartremoverErrors += Wart.Null

libraryDependencies ++= Seq(
  "eu.timepit" %% "refined" % "0.9.3",
  "org.typelevel" %% "cats-core" % "1.5.0",
  "org.scalatest" %% "scalatest" % "3.0.5" % "test"
)