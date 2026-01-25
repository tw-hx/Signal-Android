plugins {
  id("signal-library")
}

android {
  namespace = "org.signal.billing"
}

dependencies {
  lintChecks(project(":lintchecks"))

  implementation(project(":core:util"))
}
