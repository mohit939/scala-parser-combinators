addSbtPlugin("org.scala-lang.modules" % "sbt-scala-module" % "1.0.12")

addSbtPlugin("org.scala-js"     % "sbt-scalajs"              % "0.6.18")
addSbtPlugin("org.scala-native" % "sbt-crossproject"         % "0.2.0")
addSbtPlugin("org.scala-native" % "sbt-scalajs-crossproject" % "0.2.0")
addSbtPlugin("org.scala-native" % "sbt-scala-native"         % "0.3.1")
libraryDependencies ++= Seq(
    "org.jacoco" % "org.jacoco.core" % "0.5.7.201204190339" artifacts(Artifact("org.jacoco.core", "jar", "jar")),
    "org.jacoco" % "org.jacoco.report" % "0.5.7.201204190339" artifacts(Artifact("org.jacoco.report", "jar", "jar")))
 
 addSbtPlugin("de.johoop" % "jacoco4sbt" % "1.2.3")
