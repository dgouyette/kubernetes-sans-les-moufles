name := """kubernetes-sans-les-moufles-backend"""

version := "1.0.0"

lazy val root = (project in file(".")).enablePlugins(PlayScala)

scalaVersion := "2.12.4"


libraryDependencies += "org.scalatestplus.play" %% "scalatestplus-play" % "3.1.2" % Test
libraryDependencies += "com.softwaremill.macwire" %% "macros" % "2.3.0" % "provided"
libraryDependencies +=   "org.cestpasdur" %% "git-info" % "0.2.1"
