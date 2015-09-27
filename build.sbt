scalaVersion := "2.11.7"

scalacOptions ++= List("-deprecation", "-unchecked", "-feature")

testOptions in Test += Tests.Argument(TestFrameworks.JUnit, "+q", "-v")

val CamelVer = "2.15.0"

val KamonVer = "0.5.1"

libraryDependencies ++= Seq(
  "com.osinka.camel"          %% "camel-kamon"            % "1.0.0-SNAPSHOT",
  "org.apache.camel"          %  "camel-core"             % CamelVer,
  "org.apache.camel"          %  "camel-spring"           % CamelVer,
//  "io.kamon"                  %% "kamon-log-reporter"     % KamonVer,
  "org.slf4j"                 %  "slf4j-simple"           % "1.7.12"
)

mainClass in Compile := Some("org.apache.camel.spring.Main")

resolvers += Resolver.sonatypeRepo("snapshots")
