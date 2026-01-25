plugins {
  id("signal-library")
  alias(libs.plugins.compose.compiler)
  alias(libs.plugins.kotlinx.serialization)
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

androidComponents {
  beforeVariants { variant ->
    val sptr = gradle.startParameter.taskRequests.toString()
    if (variant.name.lowercase().contains("foss")) variant.enable = sptr.contains("Foss")
    else if (variant.name.lowercase().contains("gms")) variant.enable = sptr.contains("Gms")
  }
}

dependencies {
  lintChecks(project(":lintchecks"))

  implementation(project(":core:serialization"))
  implementation(project(":core:ui"))
  implementation(project(":core:util"))

  implementation(libs.androidx.credentials)
  "gmsImplementation"(libs.androidx.credentials.compat)
  "fossImplementation"(project(":lib:fakegms"))
  implementation(libs.kotlinx.serialization.json)

  implementation(platform(libs.androidx.compose.bom))
  implementation(libs.androidx.compose.ui)

  testImplementation(testLibs.junit.junit)
  testImplementation(testLibs.assertk)
}
