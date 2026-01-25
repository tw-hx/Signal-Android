plugins {
  id("signal-library")
  id("kotlin-parcelize")
  alias(libs.plugins.compose.compiler)
}

android {
  namespace = "org.signal.donations"

  buildFeatures {
    buildConfig = true
    compose = true
  }

  defaultConfig {
    vectorDrawables.useSupportLibrary = true
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
  implementation(project(":core:util"))
  implementation(project(":core:ui"))
  api(project(":core:network"))

  implementation(platform(libs.androidx.compose.bom))

  api(libs.arrow.core)

  implementation(libs.kotlin.reflect)
  implementation(libs.jackson.module.kotlin)
  implementation(libs.jackson.core)
  implementation(libs.libsignal.android)

  testImplementation(testLibs.robolectric.robolectric) {
    exclude(group = "com.google.protobuf", module = "protobuf-java")
  }
  testImplementation(testFixtures(project(":lib:libsignal-service")))

  "gmsApi"(libs.google.play.services.wallet)
  "fossApi"(project(":lib:fakegms"))
  api(libs.square.okhttp3)
}
