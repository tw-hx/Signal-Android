plugins {
  id("signal-library")
  alias(libs.plugins.compose.compiler)
}

android {
  namespace = "org.signal.passwordmanager"

  buildFeatures {
    compose = true
  }

  flavorDimensions += listOf("gms")
  productFlavors {
    create("gms") {
      dimension = "gms"
      isDefault = true
    }

    create("foss") {
      dimension = "gms"
    }
  }
}

dependencies {
  lintChecks(project(":lintchecks"))

  implementation(project(":core:util"))

  implementation(libs.androidx.credentials)
  "gmsImplementation"(libs.androidx.credentials.compat)
  "fossImplementation"(project(":lib:fakegms"))

  implementation(platform(libs.androidx.compose.bom))
  implementation(libs.androidx.compose.ui)
}
