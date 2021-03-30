name := "zio"

version := "0.1"

scalaVersion := "2.13.5"


val zio = "dev.zio" %% "zio" % "1.0.5"
val zioStreams = "dev.zio" %% "zio-streams" % "1.0.5"

libraryDependencies ++= Seq(zio, zioStreams)
