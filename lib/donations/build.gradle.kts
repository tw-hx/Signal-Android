plugins {
  id("signal-library")
  id("kotlin-parcelize")
}

android {
  namespace = "org.signal.donations"

  buildFeatures {
    buildConfig = true
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
