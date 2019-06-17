ThisBuild / version := "1.0"
ThisBuild / scalaVersion := "2.12.8"

val scalatest = "org.scalatest" %% "scalatest" % "3.0.5" % "test"
val scalatic = "org.scalactic" %% "scalactic" % "3.0.5"

lazy val root = (project in file(".")).settings(
    name := "scala-code-golf",
    libraryDependencies ++= List(scalatest, scalatic)
  )
