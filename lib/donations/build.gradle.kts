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

dependencies {
  implementation(project(":core:util"))
  implementation(project(":core:ui"))

  implementation(platform(libs.androidx.compose.bom))

  implementation(libs.kotlin.reflect)
  implementation(libs.jackson.module.kotlin)
  implementation(libs.jackson.core)

  testImplementation(testLibs.robolectric.robolectric) {
    exclude(group = "com.google.protobuf", module = "protobuf-java")
  }

  "gmsApi"(libs.google.play.services.wallet)
  "fossApi"(project(":lib:fakegms"))
  api(libs.square.okhttp3)
}
